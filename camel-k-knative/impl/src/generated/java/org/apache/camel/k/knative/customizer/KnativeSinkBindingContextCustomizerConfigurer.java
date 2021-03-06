/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.k.knative.customizer;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KnativeSinkBindingContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": target.setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "kind":
        case "Kind": target.setKind(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, org.apache.camel.component.knative.spi.Knative.Type.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": return java.lang.String.class;
        case "kind":
        case "Kind": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "type":
        case "Type": return org.apache.camel.component.knative.spi.Knative.Type.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": return target.getApiVersion();
        case "kind":
        case "Kind": return target.getKind();
        case "name":
        case "Name": return target.getName();
        case "type":
        case "Type": return target.getType();
        default: return null;
        }
    }
}

