/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.db;

import com.liferay.portal.NoSuchModelException;

/**
 * @author LiferaySavvy
 */
public class NoSuchBankOrganizationException extends NoSuchModelException {

	public NoSuchBankOrganizationException() {
		super();
	}

	public NoSuchBankOrganizationException(String msg) {
		super(msg);
	}

	public NoSuchBankOrganizationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchBankOrganizationException(Throwable cause) {
		super(cause);
	}

}