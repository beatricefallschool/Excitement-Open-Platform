package eu.excitementproject.eop.biutee.operations.updater;
import java.util.Map;

import eu.excitementproject.eop.biutee.rteflow.macro.FeatureUpdate;
import eu.excitementproject.eop.common.representation.parse.tree.TreeAndParentMap;
import eu.excitementproject.eop.transformations.operations.operations.GenerationOperation;
import eu.excitementproject.eop.transformations.operations.rules.LexicalRule;
import eu.excitementproject.eop.transformations.operations.specifications.RuleSubstituteNodeSpecification;
import eu.excitementproject.eop.transformations.representation.ExtendedInfo;
import eu.excitementproject.eop.transformations.representation.ExtendedNode;
import eu.excitementproject.eop.transformations.utilities.TeEngineMlException;


/**
 * 
 * @author Asher Stern
 * 
 *
 */
public class UpdaterForLexicalRule extends FeatureVectorUpdater<RuleSubstituteNodeSpecification<LexicalRule>>
{
	@Override
	public Map<Integer, Double> updateFeatureVector(
			Map<Integer, Double> originalFeatureVector,
			FeatureUpdate featureUpdate,
			TreeAndParentMap<ExtendedInfo, ExtendedNode> textTree,
			TreeAndParentMap<ExtendedInfo, ExtendedNode> hypothesisTree,
			GenerationOperation<ExtendedInfo, ExtendedNode> operation,
			RuleSubstituteNodeSpecification<LexicalRule> specification)
			throws TeEngineMlException
	{
		return featureUpdate.forRuleWithConfidence(originalFeatureVector, specification.getRuleBaseName()  , specification.getConfidence());
	}

}
