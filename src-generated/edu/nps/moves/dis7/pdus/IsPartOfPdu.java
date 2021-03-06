/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.9.5 Used to request hierarchical linkage of separately hosted simulation entities
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class IsPartOfPdu extends EntityManagementFamilyPdu implements Serializable
{
   /** ID of entity originating PDU */
   protected EntityID  orginatingEntityID = new EntityID(); 

   /** ID of entity receiving PDU */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** relationship of joined parts */
   protected Relationship  relationship = new Relationship(); 

   /** location of part; centroid of part in host's coordinate system. x=range, y=bearing, z=0 */
   protected Vector3Float  partLocation = new Vector3Float(); 

   /** named location */
   protected NamedLocationIdentification  namedLocationID = new NamedLocationIdentification(); 

   /** entity type */
   protected EntityType  partEntityType = new EntityType(); 


/** Constructor */
 public IsPartOfPdu()
 {
    setPduType( DISPDUType.ISPARTOF );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += orginatingEntityID.getMarshalledSize();
   marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += relationship.getMarshalledSize();
   marshalSize += partLocation.getMarshalledSize();
   marshalSize += namedLocationID.getMarshalledSize();
   marshalSize += partEntityType.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link IsPartOfPdu#orginatingEntityID}
  * @param pOrginatingEntityID new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setOrginatingEntityID(EntityID pOrginatingEntityID)
{
    orginatingEntityID = pOrginatingEntityID;
    return this;
}

/** Getter for {@link IsPartOfPdu#orginatingEntityID}
  * @return value of interest */
public EntityID getOrginatingEntityID()
{
    return orginatingEntityID; 
}

/** Setter for {@link IsPartOfPdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}

/** Getter for {@link IsPartOfPdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID; 
}

/** Setter for {@link IsPartOfPdu#relationship}
  * @param pRelationship new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setRelationship(Relationship pRelationship)
{
    relationship = pRelationship;
    return this;
}

/** Getter for {@link IsPartOfPdu#relationship}
  * @return value of interest */
public Relationship getRelationship()
{
    return relationship; 
}

/** Setter for {@link IsPartOfPdu#partLocation}
  * @param pPartLocation new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setPartLocation(Vector3Float pPartLocation)
{
    partLocation = pPartLocation;
    return this;
}

/** Getter for {@link IsPartOfPdu#partLocation}
  * @return value of interest */
public Vector3Float getPartLocation()
{
    return partLocation; 
}

/** Setter for {@link IsPartOfPdu#namedLocationID}
  * @param pNamedLocationID new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setNamedLocationID(NamedLocationIdentification pNamedLocationID)
{
    namedLocationID = pNamedLocationID;
    return this;
}

/** Getter for {@link IsPartOfPdu#namedLocationID}
  * @return value of interest */
public NamedLocationIdentification getNamedLocationID()
{
    return namedLocationID; 
}

/** Setter for {@link IsPartOfPdu#partEntityType}
  * @param pPartEntityType new value of interest
  * @return same object to permit progressive setters */
public IsPartOfPdu setPartEntityType(EntityType pPartEntityType)
{
    partEntityType = pPartEntityType;
    return this;
}

/** Getter for {@link IsPartOfPdu#partEntityType}
  * @return value of interest */
public EntityType getPartEntityType()
{
    return partEntityType; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       orginatingEntityID.marshal(dos);
       receivingEntityID.marshal(dos);
       relationship.marshal(dos);
       partLocation.marshal(dos);
       namedLocationID.marshal(dos);
       partEntityType.marshal(dos);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += orginatingEntityID.unmarshal(dis);
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += relationship.unmarshal(dis);
        uPosition += partLocation.unmarshal(dis);
        uPosition += namedLocationID.unmarshal(dis);
        uPosition += partEntityType.unmarshal(dis);
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
   super.marshal(byteBuffer);
   orginatingEntityID.marshal(byteBuffer);
   receivingEntityID.marshal(byteBuffer);
   relationship.marshal(byteBuffer);
   partLocation.marshal(byteBuffer);
   namedLocationID.marshal(byteBuffer);
   partEntityType.marshal(byteBuffer);
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
    super.unmarshal(byteBuffer);

    orginatingEntityID.unmarshal(byteBuffer);
    receivingEntityID.unmarshal(byteBuffer);
    relationship.unmarshal(byteBuffer);
    partLocation.unmarshal(byteBuffer);
    namedLocationID.unmarshal(byteBuffer);
    partEntityType.unmarshal(byteBuffer);
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final IsPartOfPdu rhs = (IsPartOfPdu)obj;

     if( ! (orginatingEntityID.equals( rhs.orginatingEntityID) )) ivarsEqual = false;
     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (relationship.equals( rhs.relationship) )) ivarsEqual = false;
     if( ! (partLocation.equals( rhs.partLocation) )) ivarsEqual = false;
     if( ! (namedLocationID.equals( rhs.namedLocationID) )) ivarsEqual = false;
     if( ! (partEntityType.equals( rhs.partEntityType) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" orginatingEntityID: ").append(orginatingEntityID).append("\n");
    sb.append(" receivingEntityID: ").append(receivingEntityID).append("\n");
    sb.append(" relationship: ").append(relationship).append("\n");
    sb.append(" partLocation: ").append(partLocation).append("\n");
    sb.append(" namedLocationID: ").append(namedLocationID).append("\n");
    sb.append(" partEntityType: ").append(partEntityType).append("\n");

   return sb.toString();
 }
} // end of class
