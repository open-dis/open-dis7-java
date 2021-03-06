/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 9.4.5 Representation of weapons fire in a DIS exercise involving LEs.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LEFirePdu extends LiveEntityFamilyPdu implements Serializable
{
   /** firingLiveEntityId is an undescribed parameter... */
   protected EntityID  firingLiveEntityId = new EntityID(); 

   /** Bits defined in IEEE Standard */
   protected byte  flags;

   /** targetLiveEntityId is an undescribed parameter... */
   protected EntityID  targetLiveEntityId = new EntityID(); 

   /** munitionLiveEntityId is an undescribed parameter... */
   protected EntityID  munitionLiveEntityId = new EntityID(); 

   /** eventId is an undescribed parameter... */
   protected EventIdentifier  eventId = new EventIdentifier(); 

   /** location is an undescribed parameter... */
   protected LiveEntityRelativeWorldCoordinates  location = new LiveEntityRelativeWorldCoordinates(); 

   /** munitionDescriptor is an undescribed parameter... */
   protected MunitionDescriptor  munitionDescriptor = new MunitionDescriptor(); 

   /** velocity is an undescribed parameter... */
   protected LiveEntityLinearVelocity  velocity = new LiveEntityLinearVelocity(); 

   /** range is an undescribed parameter... */
   protected short  range;


/** Constructor */
 public LEFirePdu()
 {
    setPduType( DISPDUType.LIVE_ENTITY_FIRE );
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
   marshalSize += firingLiveEntityId.getMarshalledSize();
   marshalSize += 1;  // flags
   marshalSize += targetLiveEntityId.getMarshalledSize();
   marshalSize += munitionLiveEntityId.getMarshalledSize();
   marshalSize += eventId.getMarshalledSize();
   marshalSize += location.getMarshalledSize();
   marshalSize += munitionDescriptor.getMarshalledSize();
   marshalSize += velocity.getMarshalledSize();
   marshalSize += 2;  // range

   return marshalSize;
}


/** Setter for {@link LEFirePdu#firingLiveEntityId}
  * @param pFiringLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setFiringLiveEntityId(EntityID pFiringLiveEntityId)
{
    firingLiveEntityId = pFiringLiveEntityId;
    return this;
}

/** Getter for {@link LEFirePdu#firingLiveEntityId}
  * @return value of interest */
public EntityID getFiringLiveEntityId()
{
    return firingLiveEntityId; 
}

/** Setter for {@link LEFirePdu#flags}
  * @param pFlags new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setFlags(byte pFlags)
{
    flags = pFlags;
    return this;
}
/** Utility setter for {@link LEFirePdu#flags}
  * @param pFlags new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setFlags(int pFlags){
    flags = (byte) pFlags;
    return this;
}

/** Getter for {@link LEFirePdu#flags}
  * @return value of interest */
public byte getFlags()
{
    return flags; 
}

/** Setter for {@link LEFirePdu#targetLiveEntityId}
  * @param pTargetLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setTargetLiveEntityId(EntityID pTargetLiveEntityId)
{
    targetLiveEntityId = pTargetLiveEntityId;
    return this;
}

/** Getter for {@link LEFirePdu#targetLiveEntityId}
  * @return value of interest */
public EntityID getTargetLiveEntityId()
{
    return targetLiveEntityId; 
}

/** Setter for {@link LEFirePdu#munitionLiveEntityId}
  * @param pMunitionLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setMunitionLiveEntityId(EntityID pMunitionLiveEntityId)
{
    munitionLiveEntityId = pMunitionLiveEntityId;
    return this;
}

/** Getter for {@link LEFirePdu#munitionLiveEntityId}
  * @return value of interest */
public EntityID getMunitionLiveEntityId()
{
    return munitionLiveEntityId; 
}

/** Setter for {@link LEFirePdu#eventId}
  * @param pEventId new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setEventId(EventIdentifier pEventId)
{
    eventId = pEventId;
    return this;
}

/** Getter for {@link LEFirePdu#eventId}
  * @return value of interest */
public EventIdentifier getEventId()
{
    return eventId; 
}

/** Setter for {@link LEFirePdu#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setLocation(LiveEntityRelativeWorldCoordinates pLocation)
{
    location = pLocation;
    return this;
}

/** Getter for {@link LEFirePdu#location}
  * @return value of interest */
public LiveEntityRelativeWorldCoordinates getLocation()
{
    return location; 
}

/** Setter for {@link LEFirePdu#munitionDescriptor}
  * @param pMunitionDescriptor new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setMunitionDescriptor(MunitionDescriptor pMunitionDescriptor)
{
    munitionDescriptor = pMunitionDescriptor;
    return this;
}

/** Getter for {@link LEFirePdu#munitionDescriptor}
  * @return value of interest */
public MunitionDescriptor getMunitionDescriptor()
{
    return munitionDescriptor; 
}

/** Setter for {@link LEFirePdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setVelocity(LiveEntityLinearVelocity pVelocity)
{
    velocity = pVelocity;
    return this;
}

/** Getter for {@link LEFirePdu#velocity}
  * @return value of interest */
public LiveEntityLinearVelocity getVelocity()
{
    return velocity; 
}

/** Setter for {@link LEFirePdu#range}
  * @param pRange new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setRange(short pRange)
{
    range = pRange;
    return this;
}
/** Utility setter for {@link LEFirePdu#range}
  * @param pRange new value of interest
  * @return same object to permit progressive setters */
public LEFirePdu setRange(int pRange){
    range = (short) pRange;
    return this;
}

/** Getter for {@link LEFirePdu#range}
  * @return value of interest */
public short getRange()
{
    return range; 
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
       firingLiveEntityId.marshal(dos);
       dos.writeByte(flags);
       targetLiveEntityId.marshal(dos);
       munitionLiveEntityId.marshal(dos);
       eventId.marshal(dos);
       location.marshal(dos);
       munitionDescriptor.marshal(dos);
       velocity.marshal(dos);
       dos.writeShort(range);
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
        uPosition += firingLiveEntityId.unmarshal(dis);
        flags = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += targetLiveEntityId.unmarshal(dis);
        uPosition += munitionLiveEntityId.unmarshal(dis);
        uPosition += eventId.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        uPosition += munitionDescriptor.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        range = (short)dis.readUnsignedShort();
        uPosition += 2;
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
   firingLiveEntityId.marshal(byteBuffer);
   byteBuffer.put( (byte)flags);
   targetLiveEntityId.marshal(byteBuffer);
   munitionLiveEntityId.marshal(byteBuffer);
   eventId.marshal(byteBuffer);
   location.marshal(byteBuffer);
   munitionDescriptor.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   byteBuffer.putShort( (short)range);
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

    firingLiveEntityId.unmarshal(byteBuffer);
    flags = (byte)(byteBuffer.get() & 0xFF);
    targetLiveEntityId.unmarshal(byteBuffer);
    munitionLiveEntityId.unmarshal(byteBuffer);
    eventId.unmarshal(byteBuffer);
    location.unmarshal(byteBuffer);
    munitionDescriptor.unmarshal(byteBuffer);
    velocity.unmarshal(byteBuffer);
    range = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LEFirePdu rhs = (LEFirePdu)obj;

     if( ! (firingLiveEntityId.equals( rhs.firingLiveEntityId) )) ivarsEqual = false;
     if( ! (flags == rhs.flags)) ivarsEqual = false;
     if( ! (targetLiveEntityId.equals( rhs.targetLiveEntityId) )) ivarsEqual = false;
     if( ! (munitionLiveEntityId.equals( rhs.munitionLiveEntityId) )) ivarsEqual = false;
     if( ! (eventId.equals( rhs.eventId) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
     if( ! (munitionDescriptor.equals( rhs.munitionDescriptor) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (range == rhs.range)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" firingLiveEntityId: ").append(firingLiveEntityId).append("\n");
    sb.append(" flags: ").append(flags).append("\n");
    sb.append(" targetLiveEntityId: ").append(targetLiveEntityId).append("\n");
    sb.append(" munitionLiveEntityId: ").append(munitionLiveEntityId).append("\n");
    sb.append(" eventId: ").append(eventId).append("\n");
    sb.append(" location: ").append(location).append("\n");
    sb.append(" munitionDescriptor: ").append(munitionDescriptor).append("\n");
    sb.append(" velocity: ").append(velocity).append("\n");
    sb.append(" range: ").append(range).append("\n");

   return sb.toString();
 }
} // end of class
