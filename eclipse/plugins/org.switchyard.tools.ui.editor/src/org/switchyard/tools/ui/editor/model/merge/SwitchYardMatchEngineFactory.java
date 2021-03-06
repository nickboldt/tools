/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.model.merge;

import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine.Factory;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher.DefaultIDFunction;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardSwitch;

/**
 * SwitchYardMatchEngineFactory
 * <p/>
 * 
 * Creates match engines for matching switchyard.xml files.
 */
public class SwitchYardMatchEngineFactory implements Factory {

    private final IMatchEngine _matchEngine;
    private int _ranking = 20;

    /**
     * Create a new SwitchYardMatchEngineFactory.
     * 
     */
    public SwitchYardMatchEngineFactory() {
        ProximityEObjectMatcher.DistanceFunction meter = EditionDistance.builder()
                .weightProvider(new ReflectiveWeightProvider() {
                    @Override
                    public int getWeight(EStructuralFeature feature) {
                        // treat the following features as id's/names
                        if (feature == ScaPackage.eINSTANCE.getComposite_TargetNamespace()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getJavaInterface_Interface()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getWSDLPortType_Interface()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_FaultType()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_InputType()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getEsbInterface_OutputType()) {
                            return 8;
                        } else if (feature == BeanPackage.eINSTANCE.getBeanImplementationType_Class()) {
                            return 8;
                        } else if (feature == ScaPackage.eINSTANCE.getBPELImplementation_Process()) {
                            return 8;
                        } else if (feature == BPMPackage.eINSTANCE.getBPMImplementationType_ProcessId()) {
                            return 8;
                        } else if (feature == CamelPackage.eINSTANCE.getCamelImplementationType_Java()) {
                            return 8;
                        } else if (feature == CamelPackage.eINSTANCE.getCamelImplementationType_Xml()) {
                            return 8;
                        } else if (feature == RulesPackage.eINSTANCE.getRulesImplementationType_Manifest()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getTransformType_From()) {
                            return 8;
                        } else if (feature == SwitchyardPackage.eINSTANCE.getTransformType_To()) {
                            return 8;
                        }
                        return super.getWeight(feature);
                    }

                    @Override
                    protected boolean irrelevant(EStructuralFeature feat) {
                        return !(feat.isTransient() && ExtendedMetaData.INSTANCE.getGroup(feat) != null)
                                && (super.irrelevant(feat) || ExtendedMetaData.INSTANCE.getFeatureKind(feat) == ExtendedMetaData.GROUP_FEATURE);
                    }
                }).build();
        IEObjectMatcher matcher = new IdentifierEObjectMatcher(new ProximityEObjectMatcher(meter), new IDFunctionOverride());
        _matchEngine = new DefaultMatchEngine(matcher, new DefaultComparisonFactory(new DefaultEqualityHelperFactory()));
    }

    @Override
    public IMatchEngine getMatchEngine() {
        return _matchEngine;
    }

    @Override
    public int getRanking() {
        return _ranking;
    }

    @Override
    public void setRanking(int ranking) {
        _ranking = ranking;
    }

    @Override
    public boolean isMatchEngineFactoryFor(IComparisonScope scope) {
        return scope.getLeft() instanceof SwitchyardResourceImpl && scope.getRight() instanceof SwitchyardResourceImpl;
    }

    private static final class IDFunctionOverride extends DefaultIDFunction {
        @Override
        public String apply(EObject eObject) {
            // ensure container classes always match
            return new SwitchyardSwitch<String>() {
                @Override
                public String caseArtifactsType(ArtifactsType object) {
                    return SwitchyardPackage.eINSTANCE.getSwitchYardType_Artifacts().getName();
                }
                @Override
                public String caseDomainType(DomainType object) {
                    return SwitchyardPackage.eINSTANCE.getSwitchYardType_Domain().getName();
                }
                @Override
                public String casePropertiesType(PropertiesType object) {
                    return object.eContainer().eClass().getName() + "Properties";
                }
                @Override
                public String caseSecuritiesType(org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType object) {
                  return SwitchyardPackage.eINSTANCE.getDomainType_Securities().getName();
                };
                @Override
                public String caseSwitchYardType(SwitchYardType object) {
                    return SwitchyardPackage.eINSTANCE.getSwitchYardType().getName();
                }
                @Override
                public String caseTransformsType(TransformsType object) {
                    return object.eContainer().eClass().getName() + "Transforms";
                }
                @Override
                public String caseValidatesType(ValidatesType object) {
                    return object.eContainer().eClass().getName() + "Validates";
                }
                @Override
                public String defaultCase(EObject object) {
                    return IDFunctionOverride.super.apply(object);
                }
            }.doSwitch(eObject);
        }
    }
}
