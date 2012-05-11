package org.xtest.runner.util;

import java.net.URI;

import org.eclipse.core.resources.IFile;

/**
 * Utilities for working with {@link URI}s
 * 
 * @author Michael Barry
 */
public class URIUtil {

    /**
     * Gets an encoded string from the file URI provided. If the URI is within a jar, the URI for
     * the jar itself is returned
     * 
     * @param uri
     *            The URI
     * @return The encoded name of the container on disk
     */
    public static String getStringFromURI(URI uri) {
        String result;
        if (uri.getScheme().equals("jar")) {
            String schemeSpecificPart = uri.getRawSchemeSpecificPart();
            int index = schemeSpecificPart.indexOf("!");
            result = schemeSpecificPart.substring(0, index);
        } else {
            result = uri.toString();
        }
        return result;
    }

    /**
     * Returns the URI for a file. First checks the project-relative location, then absolute.
     * Returns null if no suitable URI can be obtained
     * 
     * @param file
     *            The file
     * @return The URI for that file
     */
    public static URI getURIForFile(IFile file) {
        URI locationURI = file.getLocationURI();
        if (locationURI == null) {
            locationURI = file.getFullPath().toFile().toURI();
        }
        return locationURI;
    }

}
