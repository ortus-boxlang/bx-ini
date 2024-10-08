/**
 * [BoxLang]
 *
 * Copyright [2023] [Ortus Solutions, Corp]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ortus.boxlang.ini.bifs;

import ortus.boxlang.ini.util.IniFile;
import ortus.boxlang.ini.util.KeyDictionary;
import ortus.boxlang.runtime.bifs.BIF;
import ortus.boxlang.runtime.bifs.BoxBIF;
import ortus.boxlang.runtime.context.IBoxContext;
import ortus.boxlang.runtime.scopes.ArgumentsScope;
import ortus.boxlang.runtime.scopes.Key;
import ortus.boxlang.runtime.types.Argument;

@BoxBIF
public class RemoveProfileSection extends BIF {

	/**
	 * Constructor
	 */
	public RemoveProfileSection() {
		super();
		declaredArguments = new Argument[] {
		    new Argument( true, Argument.STRING, Key.filepath ),
		    new Argument( true, Argument.STRING, KeyDictionary.section )
		};
	}

	/**
	 * Removes a profile section from an initialization file.
	 *
	 * @param context   The context in which the BIF is being invoked.
	 * @param arguments Argument scope for the BIF.
	 *
	 * @argument.filePath Absolute path (drive, directory, filename, extension) of initialization file; for example, C:\boot.ini
	 *
	 * @argument.section The section of the initialization file to remove
	 *
	 * @return The ini file object.
	 */
	public IniFile _invoke( IBoxContext context, ArgumentsScope arguments ) {
		return new IniFile( arguments.getAsString( Key.filepath ) )
		    .removeSection(
		        arguments.getAsString( KeyDictionary.section )
		    );
	}

}
