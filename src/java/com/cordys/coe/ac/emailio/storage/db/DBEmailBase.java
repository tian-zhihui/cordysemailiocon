/*
 * This class has been generated by the Code Generator
 */

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
 package com.cordys.coe.ac.emailio.storage.db;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;

/**
 * DOCUMENTME.
 *
 * @author  $author$
 */
public abstract class DBEmailBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    /**
     * tags used in the XML document.
     */
    public static final String ATTR_EMAIL_ID = "EMAIL_ID";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_CONTEXT_CONTAINER = "CONTEXT_CONTAINER";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_SEQUENCE_ID = "SEQUENCE_ID";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_SEND_DATE = "SEND_DATE";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_RECEIVE_DATE = "RECEIVE_DATE";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_FROM_ADDRESS = "FROM_ADDRESS";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_TO_ADDRESS = "TO_ADDRESS";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_SUBJECT = "SUBJECT";
    /**
     * DOCUMENTME.
     */
    public static final String ATTR_CONTENT = "CONTENT";
    /**
     * DOCUMENTME.
     */
    private static final String REL_CONTEXT_CONTAINERObject = "FK:EMAIL[CONTEXT_CONTAINER]:CONTEXT_CONTAINER[CONTEXT_CONTAINER_ID]";
    /**
     * DOCUMENTME.
     */
    private static ClassInfo s_classInfo = null;

    /**
     * Creates a new DBEmailBase object.
     *
     * @param  config  DOCUMENTME
     */
    public DBEmailBase(BusObjectConfig config)
    {
        super(config);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public static ClassInfo _getClassInfo()
    {
        if (s_classInfo == null)
        {
            s_classInfo = newClassInfo(DBEmail.class);
            s_classInfo.setUIDElements(new String[] { ATTR_EMAIL_ID });

            {
                AttributeInfo ai = new AttributeInfo(ATTR_EMAIL_ID);
                ai.setJavaName("ID");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_EMAIL_ID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONTEXT_CONTAINER);
                ai.setJavaName("ContextContainerID");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_CONTEXT_CONTAINER);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_SEQUENCE_ID);
                ai.setJavaName("SequenceID");
                ai.setAttributeClass(long.class);

                NumberValidator v = new NumberValidator(ATTR_SEQUENCE_ID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_SEND_DATE);
                ai.setJavaName("SendDate");
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_RECEIVE_DATE);
                ai.setJavaName("ReceiveDate");
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_FROM_ADDRESS);
                ai.setJavaName("From");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_FROM_ADDRESS);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_TO_ADDRESS);
                ai.setJavaName("To");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_TO_ADDRESS);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBJECT);
                ai.setJavaName("Subject");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_SUBJECT);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONTENT);
                ai.setJavaName("Content");
                ai.setAttributeClass(String.class);

                StringValidator v = new StringValidator(ATTR_CONTENT);
                v.setMaxLength(1073741823);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }

            {
                // relation CONTEXT_CONTAINERObject
                // (FK:EMAIL[CONTEXT_CONTAINER]:CONTEXT_CONTAINER[CONTEXT_CONTAINER_ID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_CONTEXT_CONTAINERObject);
                ri.setName("CONTEXT_CONTAINERObject");
                ri.setLocalAttributes(new String[] { "CONTEXT_CONTAINER" });
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.cordys.coe.ac.emailio.storage.db.DBContextContainer.class);
                ri.setRelatedAttributes(new String[] { "CONTEXT_CONTAINER_ID" });
                ri.setRelatedIdentifier("FK:CONTEXT_CONTAINER[CONTEXT_CONTAINER_ID]:EMAIL[CONTEXT_CONTAINER]");
                ri.setLoadMethod("loadCONTEXT_CONTAINERObject");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    /**
     * DOCUMENTME.
     *
     * @param   EMAIL_ID  DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static com.cordys.coe.ac.emailio.storage.db.DBEmail getEmailObject(String EMAIL_ID)
    {
        String queryText = "select * from \"EMAIL\" where \"EMAIL_ID\" = :EMAIL_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING, EMAIL_ID);
        query.setResultClass(DBEmail.class);
        return (DBEmail) query.getObject();
    }

    /**
     * DOCUMENTME.
     *
     * @param   fromEMAIL_ID  DOCUMENTME
     * @param   toEMAIL_ID    DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static BusObjectIterator getEmailObjects(String fromEMAIL_ID, String toEMAIL_ID)
    {
        String queryText = "select * from \"EMAIL\" where \"EMAIL_ID\" between :fromEMAIL_ID and :toEMAIL_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromEMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING,
                           fromEMAIL_ID);
        query.addParameter("toEMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING, toEMAIL_ID);
        query.setResultClass(DBEmail.class);
        return query.getObjects();
    }

    /**
     * DOCUMENTME.
     *
     * @param   fromEMAIL_ID  DOCUMENTME
     * @param   toEMAIL_ID    DOCUMENTME
     * @param   cursor        DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static BusObjectIterator getEmailObjects(String fromEMAIL_ID, String toEMAIL_ID,
                                                    com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"EMAIL\" where \"EMAIL_ID\" between :fromEMAIL_ID and :toEMAIL_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromEMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING,
                           fromEMAIL_ID);
        query.addParameter("toEMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING, toEMAIL_ID);
        query.setResultClass(DBEmail.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    /**
     * DOCUMENTME.
     *
     * @param   CONTEXT_CONTAINER  DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static BusObjectIterator getEmailObjectsForContextContainer(String CONTEXT_CONTAINER)
    {
        String queryText = "select * from \"EMAIL\" where \"CONTEXT_CONTAINER\" = :CONTEXT_CONTAINER";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CONTEXT_CONTAINER", "EMAIL.CONTEXT_CONTAINER", QueryObject.PARAM_STRING,
                           CONTEXT_CONTAINER);
        query.setResultClass(DBEmail.class);
        return query.getObjects();
    }

    /**
     * DOCUMENTME.
     *
     * @param   EMAIL_ID  DOCUMENTME
     * @param   cursor    DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static BusObjectIterator getNextEmailObjects(String EMAIL_ID,
                                                        com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"EMAIL\" where (\"EMAIL_ID\" > :EMAIL_ID) order by \"EMAIL_ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING, EMAIL_ID);
        query.setResultClass(DBEmail.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    /**
     * DOCUMENTME.
     *
     * @param   EMAIL_ID  DOCUMENTME
     * @param   cursor    DOCUMENTME
     *
     * @return  DOCUMENTME
     */
    public static BusObjectIterator getPreviousEmailObjects(String EMAIL_ID,
                                                            com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"EMAIL\" where (\"EMAIL_ID\" < :EMAIL_ID) order by \"EMAIL_ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EMAIL_ID", "EMAIL.EMAIL_ID", QueryObject.PARAM_STRING, EMAIL_ID);
        query.setResultClass(DBEmail.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getContent()
    {
        return getStringProperty(ATTR_CONTENT);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public DBContextContainer getCONTEXT_CONTAINERObject()
    {
        return (DBContextContainer) getSingleRelationObject(REL_CONTEXT_CONTAINERObject);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getContextContainerID()
    {
        return getStringProperty(ATTR_CONTEXT_CONTAINER);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getFrom()
    {
        return getStringProperty(ATTR_FROM_ADDRESS);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getID()
    {
        return getStringProperty(ATTR_EMAIL_ID);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public java.util.Date getReceiveDate()
    {
        return getDateTimestampProperty(ATTR_RECEIVE_DATE);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public java.util.Date getSendDate()
    {
        return getDateTimestampProperty(ATTR_SEND_DATE);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public long getSequenceID()
    {
        return getLongProperty(ATTR_SEQUENCE_ID);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getSubject()
    {
        return getStringProperty(ATTR_SUBJECT);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public String getTo()
    {
        return getStringProperty(ATTR_TO_ADDRESS);
    }

    /**
     * DOCUMENTME.
     *
     * @return  DOCUMENTME
     */
    public DBContextContainer loadCONTEXT_CONTAINERObject()
    {
        String queryText = "select * from \"CONTEXT_CONTAINER\" where \"CONTEXT_CONTAINER_ID\" = :CONTEXT_CONTAINER";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CONTEXT_CONTAINER", "CONTEXT_CONTAINER.CONTEXT_CONTAINER_ID",
                           QueryObject.PARAM_STRING, getContextContainerID());
        query.setResultClass(DBContextContainer.class);
        return (DBContextContainer) query.getObject();
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setContent(String value)
    {
        setProperty(ATTR_CONTENT, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  a_CONTEXT_CONTAINER  DOCUMENTME
     */
    public void setCONTEXT_CONTAINERObject(DBContextContainer a_CONTEXT_CONTAINER)
    {
        if (a_CONTEXT_CONTAINER == null)
        {
            this.setNull("CONTEXT_CONTAINER");
        }
        else
        {
            this.setContextContainerID(a_CONTEXT_CONTAINER.getID());
        }
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setContextContainerID(String value)
    {
        String[] relations = new String[] { REL_CONTEXT_CONTAINERObject };
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_CONTEXT_CONTAINER, value, 0);
        this.updateSingleRelations(relations, true);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setFrom(String value)
    {
        setProperty(ATTR_FROM_ADDRESS, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setID(String value)
    {
        setProperty(ATTR_EMAIL_ID, value, 0);
    }

    /**
     * @see  com.cordys.cpc.bsf.busobject.BusObject#setNull(java.lang.String)
     */
    @Override public void setNull(String element)
    {
        super.setNull(element);

        if (ATTR_CONTEXT_CONTAINER.equals(element))
        {
            this.updateSingleRelation(REL_CONTEXT_CONTAINERObject, false);
        }
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setReceiveDate(java.util.Date value)
    {
        setProperty(ATTR_RECEIVE_DATE, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setSendDate(java.util.Date value)
    {
        setProperty(ATTR_SEND_DATE, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setSequenceID(long value)
    {
        setProperty(ATTR_SEQUENCE_ID, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setSubject(String value)
    {
        setProperty(ATTR_SUBJECT, value, 0);
    }

    /**
     * DOCUMENTME.
     *
     * @param  value  DOCUMENTME
     */
    public void setTo(String value)
    {
        setProperty(ATTR_TO_ADDRESS, value, 0);
    }
}