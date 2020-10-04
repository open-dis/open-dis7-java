/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AttributeRecordSet extends Object implements Serializable
{
   protected EntityID  entityId = new EntityID(); 

   protected short  numberOfAttributeRecords;

   protected List< Attribute > attributeRecords = new ArrayList< Attribute >();
 

/** Constructor */
 public AttributeRecordSet()
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

   marshalSize += entityId.getMarshalledSize();
   marshalSize += 2;  // numberOfAttributeRecords
   for(int idx=0; idx < attributeRecords.size(); idx++)
   {
        Attribute listElement = attributeRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link AttributeRecordSet#entityId}
  * @param pEntityId new value of interest
  * @return same object to permit progressive setters */
public AttributeRecordSet setEntityId(EntityID pEntityId)
{
    entityId = pEntityId;
    return this;
}

/** Getter for {@link AttributeRecordSet#entityId}
  * @return value of interest */
public EntityID getEntityId()
{
    return entityId; 
}

/** Setter for {@link AttributeRecordSet#attributeRecords}
  * @param pAttributeRecords new value of interest
  * @return same object to permit progressive setters */
public AttributeRecordSet setAttributeRecords(List<Attribute> pAttributeRecords)
{
    attributeRecords = pAttributeRecords;
    return this;
}

/** Getter for {@link AttributeRecordSet#attributeRecords}
  * @return value of interest */
public List<Attribute> getAttributeRecords()
{
    return attributeRecords; 
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
       entityId.marshal(dos);
       dos.writeShort(attributeRecords.size());

       for(int idx = 0; idx < attributeRecords.size(); idx++)
       {
            Attribute aAttribute = attributeRecords.get(idx);
            aAttribute.marshal(dos);
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
        uPosition += entityId.unmarshal(dis);
        numberOfAttributeRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfAttributeRecords; idx++)
        {
            Attribute anX = new Attribute();
            uPosition += anX.unmarshal(dis);
            attributeRecords.add(anX);
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
   entityId.marshal(byteBuffer);
   byteBuffer.putShort( (short)attributeRecords.size());

   for(int idx = 0; idx < attributeRecords.size(); idx++)
   {
        Attribute aAttribute = attributeRecords.get(idx);
        aAttribute.marshal(byteBuffer);
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
    entityId.unmarshal(byteBuffer);
    numberOfAttributeRecords = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfAttributeRecords; idx++)
    {
    Attribute anX = new Attribute();
    anX.unmarshal(byteBuffer);
    attributeRecords.add(anX);
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

     final AttributeRecordSet rhs = (AttributeRecordSet)obj;

     if( ! (entityId.equals( rhs.entityId) )) ivarsEqual = false;

     for(int idx = 0; idx < attributeRecords.size(); idx++)
        if( ! ( attributeRecords.get(idx).equals(rhs.attributeRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" entityId: ").append(entityId).append("\n");
    sb.append(" attributeRecords: ").append("\n");
    attributeRecords.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
