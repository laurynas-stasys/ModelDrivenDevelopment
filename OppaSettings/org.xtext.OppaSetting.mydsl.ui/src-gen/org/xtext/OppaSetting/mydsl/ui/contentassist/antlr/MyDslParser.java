/*
* generated by Xtext
*/
package org.xtext.OppaSetting.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.OppaSetting.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSettingsModelAccess().getGroup(), "rule__SettingsModel__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_3(), "rule__Section__Group_3__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getFeatureAccess().getGroup_6(), "rule__Feature__Group_6__0");
					put(grammarAccess.getFeatureAccess().getGroup_7(), "rule__Feature__Group_7__0");
					put(grammarAccess.getFeatureAccess().getGroup_8(), "rule__Feature__Group_8__0");
					put(grammarAccess.getFeatureAccess().getGroup_8_3(), "rule__Feature__Group_8_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_9(), "rule__Feature__Group_9__0");
					put(grammarAccess.getFeatureAccess().getGroup_9_3(), "rule__Feature__Group_9_3__0");
					put(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2(), "rule__SettingsModel__SectionsAssignment_2");
					put(grammarAccess.getSectionAccess().getNameAssignment_2(), "rule__Section__NameAssignment_2");
					put(grammarAccess.getSectionAccess().getFeaturesAssignment_3_1(), "rule__Section__FeaturesAssignment_3_1");
					put(grammarAccess.getFeatureAccess().getNameAssignment_3(), "rule__Feature__NameAssignment_3");
					put(grammarAccess.getFeatureAccess().getIdAssignment_5_1(), "rule__Feature__IdAssignment_5_1");
					put(grammarAccess.getFeatureAccess().getDescriptionAssignment_6_1(), "rule__Feature__DescriptionAssignment_6_1");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_7_1(), "rule__Feature__TypeAssignment_7_1");
					put(grammarAccess.getFeatureAccess().getExcludesAssignment_8_2(), "rule__Feature__ExcludesAssignment_8_2");
					put(grammarAccess.getFeatureAccess().getExcludesAssignment_8_3_1(), "rule__Feature__ExcludesAssignment_8_3_1");
					put(grammarAccess.getFeatureAccess().getDependsAssignment_9_2(), "rule__Feature__DependsAssignment_9_2");
					put(grammarAccess.getFeatureAccess().getDependsAssignment_9_3_1(), "rule__Feature__DependsAssignment_9_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleSettingsModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
