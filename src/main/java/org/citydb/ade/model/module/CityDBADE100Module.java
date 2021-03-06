/*
 * 3D City Database - The Open Source CityGML Database
 * https://www.3dcitydb.org/
 *
 * Copyright 2013 - 2021
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.lrg.tum.de/gis/
 *
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 *
 * Virtual City Systems, Berlin <https://vc.systems/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citydb.ade.model.module;

import org.citydb.ade.CityDBADEContext;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CityDBADE100Module extends ADEModule {
    public static final CityDBADE100Module v3_0 = new CityDBADE100Module();

    private CityDBADE100Module() {
        super("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0",
                "citydb",
                "http://www.3dcitydb.org/citygml-ade/3.0/3dcitydb-ade-citygml-1.0.xsd",
                CityGMLVersion.v1_0_0);
    }

    @Override
    public URL getSchemaResource() {
        return CityDBADEContext.class.getResource("/org/citydb/ade/schema/3dcitydb-ade-citygml-1.0.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("org.citydb.ade._3._1");
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return false;
    }

    @Override
    public boolean hasFeature(String name) {
        return false;
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return null;
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return null;
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return false;
    }
}
