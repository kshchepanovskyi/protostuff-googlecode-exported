//========================================================================
//Copyright 2007-2009 David Yu dyuproject@gmail.com
//------------------------------------------------------------------------
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at 
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//========================================================================

package com.dyuproject.protostuff;

import java.io.IOException;

/**
 * An Output lets an application write primitive data types and objects to 
 * a sink of data.
 *
 * @author David Yu
 * @created Nov 9, 2009
 */
public interface Output
{
    
    /** Writes a variable int field. */
    public void writeInt32(int fieldNumber, int value) throws IOException;
    
    /** Writes an unsigned int field. */
    public void writeUInt32(int fieldNumber, int value) throws IOException;
    
    /** Writes a signed int field. */
    public void writeSInt32(int fieldNumber, int value) throws IOException;
    
    /** Writes a fixed int(4 bytes) field. */
    public void writeFixed32(int fieldNumber, int value) throws IOException;
    
    /** Writes a signed+fixed int(4 bytes) field. */
    public void writeSFixed32(int fieldNumber, int value) throws IOException;
    
    /** Writes a variable long field. */
    public void writeInt64(int fieldNumber, long value) throws IOException;
    
    /** Writes an unsigned long field. */
    public void writeUInt64(int fieldNumber, long value) throws IOException;
    
    /** Writes a signed long field. */
    public void writeSInt64(int fieldNumber, long value) throws IOException;
    
    /** Writes a fixed long(8 bytes) field. */
    public void writeFixed64(int fieldNumber, long value) throws IOException;
    
    /** Writes a signed+fixed long(8 bytes) field. */
    public void writeSFixed64(int fieldNumber, long value) throws IOException;
    
    /** Writes a float field. */
    public void writeFloat(int fieldNumber, float value) throws IOException;
    
    /** Writes a double field. */
    public void writeDouble(int fieldNumber, double value) throws IOException;
    
    /** Writes a boolean field. */
    public void writeBool(int fieldNumber, boolean value) throws IOException;
    
    /** Writes a enum(its number) field. */
    public void writeEnum(int fieldNumber, int value) throws IOException;
    
    /** Writes a String field. */
    public void writeString(int fieldNumber, String value) throws IOException;
    
    /** Writes a ByteString(wraps byte array) field. */
    public void writeBytes(int fieldNumber, ByteString value) throws IOException;
    
    /** Writes a byte array field. */
    public void writeByteArray(int fieldNumber, byte[] value) throws IOException;
    
    /** Writes a message field. */
    public <T extends Message<T>> void writeMessage(int fieldNumber, T value) throws IOException;
    
    /** Writes an object(using its schema) field. */
    public <T> void writeObject(int fieldNumber, T value, Schema<T> schema) throws IOException;
    

}
