/*
* generated by Xtext
*/
package org.xtext.OppaSetting.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/OppaSetting/mydsl/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
