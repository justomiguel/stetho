/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
//
// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.stetho.inspector.jsonrpc.protocol;

import javax.annotation.Nullable;

import android.annotation.SuppressLint;

import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

@SuppressLint({ "UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse" })
public class JsonRpcEvent {
  @JsonProperty(required = true)
  public String method;

  @JsonProperty
  public JSONObject params;

  public JsonRpcEvent() {
  }

  public JsonRpcEvent(String method, @Nullable JSONObject params) {
    this.method = method;
    this.params = params;
  }
}
