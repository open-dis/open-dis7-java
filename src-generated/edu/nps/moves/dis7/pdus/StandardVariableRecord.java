/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Section 6.2.83
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class StandardVariableRecord extends Object implements Serializable
{
   /**  uid 66 */
   protected VariableRecordType recordType = VariableRecordType.values()[0];

   /** recordLength is an undescribed parameter... */
   protected short  recordLength;

   /** recordSpecificFields is an undescribed parameter... */
   protected byte[]  recordSpecificFields = new byte[0]; 

   /** pad to 64-bit boundary */

   private byte[] padding = new byte[0];


/** Constructor */
 public StandardVariableRecord()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += recordType.getMarshalledSize();
   marshalSize += 2;  // recordLength
   marshalSize += recordSpecificFields.length * 1;
   marshalSize += padding.length;

   return marshalSize;
}


/** Setter for {@link StandardVariableRecord#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public StandardVariableRecord setRecordType(VariableRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link StandardVariableRecord#recordType}
  * @return value of interest */
public VariableRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link StandardVariableRecord#recordSpecificFields}
  * @param pRecordSpecificFields new value of interest
  * @return same object to permit progressive setters */
public StandardVariableRecord setRecordSpecificFields(byte[] pRecordSpecificFields)
{
    recordSpecificFields = pRecordSpecificFields;
    return this;
}

/** Getter for {@link StandardVariableRecord#recordSpecificFields}
  * @return value of interest */
public byte[] getRecordSpecificFields()
{
    return recordSpecificFields; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       recordType.marshal(dos);
       dos.writeShort(recordSpecificFields.length);

       for(int idx = 0; idx < recordSpecificFields.length; idx++)
           dos.writeByte(recordSpecificFields[idx]);

       padding = new byte[Align.to64bits(dos)];
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        recordType = VariableRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < recordSpecificFields.length; idx++)
            recordSpecificFields[idx] = dis.readByte();
        uPosition += (recordSpecificFields.length * 1);
        padding = new byte[Align.from64bits(uPosition,dis)];
        uPosition += padding.length;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   recordType.marshal(byteBuffer);
   byteBuffer.putShort( (short)recordSpecificFields.length);

   for(int idx = 0; idx < recordSpecificFields.length; idx++)
       byteBuffer.put((byte)recordSpecificFields[idx]);

   padding = new byte[Align.to64bits(byteBuffer)];
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    recordType = VariableRecordType.unmarshalEnum(byteBuffer);
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < recordSpecificFields.length; idx++)
        recordSpecificFields[idx] = byteBuffer.get();
    padding = new byte[Align.from64bits(byteBuffer)];
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final StandardVariableRecord rhs = (StandardVariableRecord)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;

     for(int idx = 0; idx < 0; idx++)
     {
          if(!(recordSpecificFields[idx] == rhs.recordSpecificFields[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordSpecificFields: ").append("\n");
    sb.append(Arrays.toString(recordSpecificFields)).append("\n");
    sb.append(" padding: ").append(padding).append("\n");

   return sb.toString();
 }
} // end of class
