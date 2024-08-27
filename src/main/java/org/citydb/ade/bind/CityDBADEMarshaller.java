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

package org.citydb.ade.bind;

import org.citydb.ade.bind.marshal.CityDBADE100Marshaller;
import org.citydb.ade.bind.marshal.CityDBADE200Marshaller;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.bind.JAXBElement;

public class CityDBADEMarshaller implements ADEMarshaller {
    private ADEMarshaller marshaller;

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        marshaller = helper.getTargetCityGMLVersion() == CityGMLVersion.v1_0_0 ? new CityDBADE100Marshaller() : new CityDBADE200Marshaller();
        marshaller.setADEMarshallerHelper(helper);
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        return marshaller.marshalJAXBElement(src);
    }

    @Override
    public Object marshal(ADEModelObject src) {
        return marshaller.marshal(src);
    }

}
