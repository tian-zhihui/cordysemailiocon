/**
 * Copyright 2005 Cordys R&D B.V. 
 * 
 * This file is part of the Cordys SAP Connector. 
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
 package com.cordys.coe.test;

import java.io.File;

/**
 * @author pgussow
 *
 */
public class TestFolderMove
{
	/**
	 * Main method.
	 *
	 * @param saArguments The commandline arguments.
	 */
	public static void main(String[] saArguments)
	{
		try
		{
			File fTemp = new File("d:/temp");
			File fBackup = new File(fTemp, "backup");
			fBackup.mkdirs();
			
			File fTest = new File(fTemp, "dddd");
			fTest.mkdirs();
			new File(fTest, "iets.txt").createNewFile();
			
			fTest.renameTo(new File(fBackup, fTest.getName()));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}