// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.net.URI;

import com.microsoft.alm.client.VssRestClientHandler;

public class ExtensionManagementHttpClient extends ExtensionManagementHttpClientBase {

    public ExtensionManagementHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }
}
