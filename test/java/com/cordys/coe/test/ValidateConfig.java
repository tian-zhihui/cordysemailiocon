
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

import java.io.File;

import javax.xml.XMLConstants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * DOCUMENTME .
 *
 * @author  pgussow
 */
public class ValidateConfig
{
    /**
     * Main method.
     *
     * @param  saArguments  The commandline arguments.
     */
    public static void main(String[] saArguments)
    {
        try
        {
            String sConfigFile = "./docs/internal/siemens_config.xml";
            String sXSD = "./docs/external/configuration.xsd";

            // Set up the schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(sXSD));

            // Set up the XML parser
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            dbf.setIgnoringElementContentWhitespace(true);
            dbf.setIgnoringComments(true);
            dbf.setSchema(schema);

            // Create the new document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            db.setErrorHandler(new LocalErrorHandler());

            db.parse(new File(sConfigFile));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * DOCUMENTME .
     *
     * @author  pgussow
     */
    public static class LocalErrorHandler
        implements ErrorHandler
    {
        /**
         * @see  org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
         */
        @Override public void error(SAXParseException exception)
                             throws SAXException
        {
            System.out.println("Error: " + exception.getLineNumber() + ":" +
                               exception.getColumnNumber() + " " + exception.getMessage());
        }

        /**
         * @see  org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
         */
        @Override public void fatalError(SAXParseException exception)
                                  throws SAXException
        {
            System.out.println("Fatal: " + exception.getLineNumber() + ":" +
                               exception.getColumnNumber() + " " + exception.getMessage());
        }

        /**
         * @see  org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
         */
        @Override public void warning(SAXParseException exception)
                               throws SAXException
        {
            System.out.println(" Warn: " + exception.getLineNumber() + ":" +
                               exception.getColumnNumber() + " " + exception.getMessage());
        }
    }
}
