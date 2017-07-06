/*
 * Copyright (C) 2017 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.sparta.security

case class Resource(resourceType: ResourceType, name: String)

sealed trait ResourceType{
  def name(): String
}

case object InputResource extends ResourceType{
  override def name(): String = "input"
}

case object OutputResource extends ResourceType{
  override def name(): String = "output"
}

case object PolicyResource extends ResourceType{
  override def name(): String = "policy"
}

case object PluginResource extends ResourceType{
  override def name(): String = "plugin"
}

case object DriverResource extends ResourceType{
  override def name(): String = "driver"
}

case object ContextResource extends ResourceType{
  override def name(): String = "context"
}

case object CheckpointResource extends ResourceType{
  override def name(): String = "checkpoint"
}

case object BackupResource extends ResourceType{
  override def name(): String = "backup"
}