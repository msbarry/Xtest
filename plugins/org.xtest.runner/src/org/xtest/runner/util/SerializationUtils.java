package org.xtest.runner.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.codec.binary.Base64;

import com.google.common.base.Optional;

/**
 * Utilities for serializing objects to/from strings
 * 
 * @author Michael Barry
 */
public class SerializationUtils {

    /**
     * Deserialize an object from the string provided, if present.
     * 
     * @param string
     *            The serialized object to deserialize
     * @return {@link Optional#absent()} if there was no string or deserialization failed, otherwise
     *         set to the deserialized object
     */
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> Optional<T> fromString(Optional<String> string) {
        T result = null;
        if (string.isPresent()) {
            byte[] bytes = Base64.decodeBase64(string.get().getBytes());
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            try {
                ObjectInputStream objectStream = new ObjectInputStream(inputStream);
                try {
                    Object readObject = objectStream.readObject();
                    result = (T) readObject;
                } catch (ClassNotFoundException e) {
                } finally {
                    objectStream.close();
                }
            } catch (IOException e) {
            }
        }
        return Optional.fromNullable(result);
    }

    /**
     * Serialize an object to a string.
     * 
     * @param object
     *            The object to serialize
     * @return {@link Optional} containing the serialized object if serialization succeeded,
     *         {@link Optional#absent()} if failed
     */
    public static <T extends Serializable> Optional<String> toString(T object) {
        String result = null;
        if (object != null) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);
                try {
                    objectStream.writeObject(object);
                    byte[] byteArray = outputStream.toByteArray();
                    result = new String(Base64.encodeBase64(byteArray));
                } finally {
                    objectStream.close();
                }
            } catch (IOException e) {
            }
        }
        return Optional.fromNullable(result);
    }
}