/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudidentity.v1.model;

/**
 * An EntityKey uniquely identifies an Entity. Namespaces are used to provide isolation for IDs. A
 * single ID can be reused across namespaces but the combination of a namespace and an ID must be
 * unique.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityKey extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the entity within the given namespace. The ID must be unique within its namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Namespaces provide isolation for IDs, so an ID only needs to be unique within its namespace.
   *
   * Namespaces are currently only created as part of IdentitySource creation from Admin Console. A
   * namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity
   * Source `identity_source_id`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * The ID of the entity within the given namespace. The ID must be unique within its namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the entity within the given namespace. The ID must be unique within its namespace.
   * @param id id or {@code null} for none
   */
  public EntityKey setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Namespaces provide isolation for IDs, so an ID only needs to be unique within its namespace.
   *
   * Namespaces are currently only created as part of IdentitySource creation from Admin Console. A
   * namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity
   * Source `identity_source_id`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Namespaces provide isolation for IDs, so an ID only needs to be unique within its namespace.
   *
   * Namespaces are currently only created as part of IdentitySource creation from Admin Console. A
   * namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity
   * Source `identity_source_id`.
   * @param namespace namespace or {@code null} for none
   */
  public EntityKey setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  @Override
  public EntityKey set(String fieldName, Object value) {
    return (EntityKey) super.set(fieldName, value);
  }

  @Override
  public EntityKey clone() {
    return (EntityKey) super.clone();
  }

}