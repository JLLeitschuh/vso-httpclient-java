// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.net.URI;

import com.microsoft.alm.client.VssRestClientHandler;

public class ReleaseHttpClient extends ReleaseHttpClientBase {

    public ReleaseHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }
}
