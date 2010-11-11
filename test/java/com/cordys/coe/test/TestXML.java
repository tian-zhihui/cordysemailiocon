
 /**
 * Copyright 2007 Cordys R&D B.V. 
 * 
 * This file is part of the Cordys Email IO Connector. 
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

import com.cordys.coe.ac.emailio.EmailIOConnectorConstants;
import com.eibus.xml.nom.Document;
import com.eibus.xml.nom.Node;

/**
 * @author pgussow
 *
 */
public class TestXML
{
	private static Document s_dDoc = new Document();
	
	/**
	 * Main method.
	 *
	 * @param saArguments The commandline arguments.
	 */
	public static void main(String[] saArguments)
	{
		try
		{
			int iMetadata = 0;
	        try
	        {
	        	iMetadata = s_dDoc.createElementNS("metadata", null, "ns", EmailIOConnectorConstants.NS_CONFIGURATION, 0);
	        	
	        	Node.createElementWithParentNS("emailcount", String.valueOf(2), iMetadata);
	        	Node.createElementWithParentNS("triggerdefinition", null, iMetadata);
	        	
	        	System.out.println(Node.writeToString(iMetadata, true));
	        }
	        finally
	        {
	        	if (iMetadata != 0)
	        	{
	        		Node.delete(iMetadata);
	        	}
	        }
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
