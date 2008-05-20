/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.webconsole;


import java.io.PrintWriter;


/**
 * The <code>ConfigurationPrinter</code> is a service interface to be used by
 * providers which want to hook into the display of the current configuration
 * of the OSGi framework.
 */
public interface ConfigurationPrinter
{

    /**
     * The service name under which services of this class must be registered
     * to be picked for inclusion in the configuration report.
     */
    static final String SERVICE = ConfigurationPrinter.class.getName();


    /**
     * Returns a human readable title string to be place in front of the configuration
     * report generated by the {@link #printConfiguration(PrintWriter)} method.
     */
    String getTitle();


    /**
     * Prints the configuration report to the given <code>printWriter</code>.
     * Implementations are free to print whatever information they deem useful.
     * The <code>printWriter</code> may be flushed but must not be closed.
     */
    void printConfiguration( PrintWriter printWriter );

}
