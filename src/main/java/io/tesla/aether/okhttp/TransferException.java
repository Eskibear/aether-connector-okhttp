/*******************************************************************************
 * Copyright (c) 2010, 2011 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype, Inc. - initial API and implementation
 *******************************************************************************/
package io.tesla.aether.okhttp;

/**
 * Simple exception when a transfer fail.
 */
class TransferException
    extends Exception
{
    public TransferException( final String message )
    {
        super( message );
    }

    public TransferException( final String message, final Throwable cause )
    {
        super( message, cause );
    }

}