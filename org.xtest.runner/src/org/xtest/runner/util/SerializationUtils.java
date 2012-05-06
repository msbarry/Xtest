package org.xtest.runner.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.eclipse.equinox.security.storage.EncodingUtils;

import com.google.common.base.Optional;

public class SerializationUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> Optional<T> fromString(Optional<String> string) {
        T result = null;
        if (string.isPresent()) {
            byte[] bytes = EncodingUtils.decodeBase64(string.get());
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

    public static <T extends Serializable> Optional<String> toString(T object) {
        String result = null;
        if (object != null) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);
                try {
                    objectStream.writeObject(object);
                    byte[] byteArray = outputStream.toByteArray();
                    result = EncodingUtils.encodeBase64(byteArray);
                } finally {
                    objectStream.close();
                }
            } catch (IOException e) {
            }
        }
        return Optional.fromNullable(result);
    }
}