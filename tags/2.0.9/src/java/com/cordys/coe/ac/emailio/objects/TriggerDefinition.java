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
 package com.cordys.coe.ac.emailio.objects;

import com.cordys.coe.ac.emailio.localization.LogMessages;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.exception.BsfApplicationRuntimeException;

/**
 * This class wraps the stored trigger definitions.
 *
 * @author  pgussow
 */
public class TriggerDefinition extends TriggerDefinitionBase
{
    /**
     * Creates a new TriggerDefinition object.
     */
    public TriggerDefinition()
    {
        this((BusObjectConfig) null);
    }

    /**
     * Creates a new TriggerDefinition object.
     *
     * @param  config  The configuration.
     */
    public TriggerDefinition(BusObjectConfig config)
    {
        super(config);
    }

    /**
     * @see  com.cordys.cpc.bsf.busobject.BusObject#onDelete()
     */
    @Override public void onDelete()
    {
        throw new BsfApplicationRuntimeException(LogMessages.OPERATION_NOT_SUPPORTED, "DELETE");
    }

    /**
     * @see  com.cordys.cpc.bsf.busobject.BusObject#onInsert()
     */
    @Override public void onInsert()
    {
        throw new BsfApplicationRuntimeException(LogMessages.OPERATION_NOT_SUPPORTED, "INSERT");
    }

    /**
     * @see  com.cordys.cpc.bsf.busobject.BusObject#onUpdate()
     */
    @Override public void onUpdate()
    {
        throw new BsfApplicationRuntimeException(LogMessages.OPERATION_NOT_SUPPORTED, "UPDATE");
    }
}
