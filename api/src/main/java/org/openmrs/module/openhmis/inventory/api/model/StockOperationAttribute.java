/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and
 * limitations under the License.
 *
 * Copyright (C) OpenHMIS.  All Rights Reserved.
 */
package org.openmrs.module.openhmis.inventory.api.model;

import org.openmrs.module.openhmis.commons.api.entity.model.BaseInstanceAttributeObject;

/**
 * A value for a user-defined {@link StockOperationAttributeType} that is stored with a {@link StockOperation}.
 * @see org.openmrs.module.openhmis.commons.api.entity.model.IInstanceAttribute
 */
public class StockOperationAttribute
        extends BaseInstanceAttributeObject<StockOperation, IStockOperationType, StockOperationAttributeType> {
	public static final long serialVersionUID = 0L;
}
