/**
 * @fileoverview
 * Registers a language handler for Xtest.
 *
 * Derived from https://github.com/eclipse/xtext/blob/master/xtext.website.generator/website/google-code-prettify/lang-xtend.js
 *
 * @author Michael Barry
 */

PR['registerLangHandler'](
    PR['createSimpleLexer'](
        [
          // Whitespace
         [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
         // A double or single quoted, possibly multi-line, string.
         [PR['PR_STRING'],      /^(?:"(?:[^\"\\]|\\.)*"|'(?:[^\'\\]|\\.)*')/, null,
          '"\''],
         [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
          '!#%&()*+,-:;<=>?@[\\]^{|}~']
        ],
        [
         // A symbol literal is a single quote followed by an identifier with no
         // single quote following
         // A character literal has single quotes on either side
         [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
         [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
         [PR['PR_KEYWORD'],     /^(?:xtest|it|assert|boolean|case|catch|char|def|default|do|double|else|finally|float|for|if|extension|import|int|long|new|return|short|static|switch|throw|try|typeof|val|var|void|while|throws|true|false|null|this|as|class)\b/],
         [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))(#(L|[Bb][Ii]))?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?([fFLlDd]|[Bb][DdIi])?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?([fFLlDd]|[Bb][DdIi])?)/i],
         // Treat upper camel case identifiers as types.
         [PR['PR_TYPE'],        /^[$_]*[A-Z][_$A-Z0-9]*[a-z][\w$]*/],
         [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
         [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
         [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/]
        ]),
    ['xtest']);
