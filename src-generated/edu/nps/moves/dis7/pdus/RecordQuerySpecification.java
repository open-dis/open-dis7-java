/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The identification of the records being queried 6.2.72
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RecordQuerySpecification extends Object implements Serializable
{
   protected int  numberOfRecords;

   /** variable length list of 32-bit record types uid = 66 */
   protected List< VariableRecordType > recordIDs = new ArrayList< VariableRecordType >();
 

/** Constructor */
 public RecordQuerySpecification()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // numberOfRecords
   for(int idx=0; idx < recordIDs.size(); idx++)
   {
        VariableRecordType listElement = recordIDs.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link RecordQuerySpecification#recordIDs}
  * @param pRecordIDs new value of interest
  * @return same object to permit progressive setters */
public RecordQuerySpecification setRecordIDs(List<VariableRecordType> pRecordIDs)
{
    recordIDs = pRecordIDs;
    return this;
}

/** Getter for {@link RecordQuerySpecification#recordIDs}
  * @return value of interest */
public List<VariableRecordType> getRecordIDs()
{
    return recordIDs; 
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
       dos.writeInt(recordIDs.size());

       for(int idx = 0; idx < recordIDs.size(); idx++)
       {
            VariableRecordType aVariableRecordType = recordIDs.get(idx);
            aVariableRecordType.marshal(dos);
       }

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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        numberOfRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfRecords; idx++)
        {
            VariableRecordType anX = VariableRecordType.unmarshalEnum(dis);
            recordIDs.add(anX);
            uPosition += anX.getMarshalledSize();
        }

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
   byteBuffer.putInt( (int)recordIDs.size());

   for(int idx = 0; idx < recordIDs.size(); idx++)
   {
        VariableRecordType aVariableRecordType = recordIDs.get(idx);
        aVariableRecordType.marshal(byteBuffer);
   }

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    numberOfRecords = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfRecords; idx++)
    {
    VariableRecordType anX = VariableRecordType.unmarshalEnum(byteBuffer);
    recordIDs.add(anX);
    }

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

     final RecordQuerySpecification rhs = (RecordQuerySpecification)obj;


     for(int idx = 0; idx < recordIDs.size(); idx++)
        if( ! ( recordIDs.get(idx).equals(rhs.recordIDs.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordIDs: ").append("\n");
    recordIDs.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
