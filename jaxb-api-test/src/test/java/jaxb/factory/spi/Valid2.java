/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jaxb.factory.spi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBContextFactory;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Validator;
import java.util.Map;

/**
 * Created by miran on 10/11/14.
 */
public class Valid2 implements JAXBContextFactory {

    @Override
    public JAXBContext createContext(Class<?>[] classesToBeBound, Map<String, ?> properties) throws JAXBException {
        return new JAXBContext1();
    }

    @Override
    public JAXBContext createContext(String contextPath, ClassLoader classLoader, Map<String, ?> properties) throws JAXBException {
        return new JAXBContext1();
    }

    public static class JAXBContext1 extends JAXBContext {
        @Override
        public Unmarshaller createUnmarshaller() throws JAXBException {
            return null;
        }

        @Override
        public Marshaller createMarshaller() throws JAXBException {
            return null;
        }

        @Override
        public Validator createValidator() throws JAXBException {
            return null;
        }
    }

}
