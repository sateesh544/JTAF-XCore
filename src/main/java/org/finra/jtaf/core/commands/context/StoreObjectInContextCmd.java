/*
 * (C) Copyright 2014 Java Test Automation Framework Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.finra.jtaf.core.commands.context;

import org.finra.jtaf.core.model.exceptions.NameFormatException;
import org.finra.jtaf.core.model.execution.IInvocationContext;
import org.finra.jtaf.core.model.invocationtarget.Command;

/**
 * Gets an object from context and stores that object into another attribute
 */
public class StoreObjectInContextCmd extends Command {

	public StoreObjectInContextCmd(String name) throws NameFormatException {
		super(name);
	}

	@Override
	protected void execute(IInvocationContext arg0) throws Throwable {
		String newKey = getRequiredString("storeKey");
		String key = getRequiredString("loadKey");
		
		Object o = getRequiredObject(key);
		arg0.putObject(newKey, o);
	}

}
