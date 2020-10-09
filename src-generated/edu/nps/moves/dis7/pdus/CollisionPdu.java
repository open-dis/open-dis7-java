/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.2.3 Collisions between entities shall be communicated by issuing a Collision PDU. See 5.3.3.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class CollisionPdu extends EntityInformationFamilyPdu implements Serializable
{
   /** This field shall identify the entity that is issuing the PDU, and shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  issuingEntityID = new EntityID(); 

   /** This field shall identify the entity that has collided with the issuing entity (see 5.3.3.4). This field shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  collidingEntityID = new EntityID(); 

   /** This field shall contain an identification generated by the issuing simulation application to associate related collision events. This field shall be represented by an Event Identifier record (see 6.2.34). */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall identify the type of collision. The Collision Type field shall be represented by an 8-bit record of enumerations uid 189 */
   protected CollisionType collisionType = CollisionType.values()[0];

   /** some padding */
   protected byte  pad = (byte)0;

   /** This field shall contain the velocity (at the time the collision is detected) of the issuing entity. The velocity shall be represented in world coordinates. This field shall be represented by the Linear Velocity Vector record [see 6.2.95 item c)]. */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** This field shall contain the mass of the issuing entity, and shall be represented by a 32-bit floating point number representing kilograms. */
   protected float  mass;

   /** This field shall specify the location of the collision with respect to the entity with which the issuing entity collided. The Location field shall be represented by an Entity Coordinate Vector record [see 6.2.95 item a)]. */
   protected Vector3Float  location = new Vector3Float(); 


/** Constructor */
 public CollisionPdu()
 {
    setPduType( DISPDUType.COLLISION );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += issuingEntityID.getMarshalledSize();
   marshalSize += collidingEntityID.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += collisionType.getMarshalledSize();
   marshalSize += 1;  // pad
   marshalSize += velocity.getMarshalledSize();
   marshalSize += 4;  // mass
   marshalSize += location.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link CollisionPdu#issuingEntityID}
  * @param pIssuingEntityID new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setIssuingEntityID(EntityID pIssuingEntityID)
{
    issuingEntityID = pIssuingEntityID;
    return this;
}

/** Getter for {@link CollisionPdu#issuingEntityID}
  * @return value of interest */
public EntityID getIssuingEntityID()
{
    return issuingEntityID; 
}

/** Setter for {@link CollisionPdu#collidingEntityID}
  * @param pCollidingEntityID new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setCollidingEntityID(EntityID pCollidingEntityID)
{
    collidingEntityID = pCollidingEntityID;
    return this;
}

/** Getter for {@link CollisionPdu#collidingEntityID}
  * @return value of interest */
public EntityID getCollidingEntityID()
{
    return collidingEntityID; 
}

/** Setter for {@link CollisionPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link CollisionPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link CollisionPdu#collisionType}
  * @param pCollisionType new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setCollisionType(CollisionType pCollisionType)
{
    collisionType = pCollisionType;
    return this;
}

/** Getter for {@link CollisionPdu#collisionType}
  * @return value of interest */
public CollisionType getCollisionType()
{
    return collisionType; 
}

/** Setter for {@link CollisionPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setPad(byte pPad)
{
    pad = pPad;
    return this;
}
/** Utility setter for {@link CollisionPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setPad(int pPad){
    pad = (byte) pPad;
    return this;
}

/** Getter for {@link CollisionPdu#pad}
  * @return value of interest */
public byte getPad()
{
    return pad; 
}

/** Setter for {@link CollisionPdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}

/** Getter for {@link CollisionPdu#velocity}
  * @return value of interest */
public Vector3Float getVelocity()
{
    return velocity; 
}

/** Setter for {@link CollisionPdu#mass}
  * @param pMass new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setMass(float pMass)
{
    mass = pMass;
    return this;
}

/** Getter for {@link CollisionPdu#mass}
  * @return value of interest */
public float getMass()
{
    return mass; 
}

/** Setter for {@link CollisionPdu#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public CollisionPdu setLocation(Vector3Float pLocation)
{
    location = pLocation;
    return this;
}

/** Getter for {@link CollisionPdu#location}
  * @return value of interest */
public Vector3Float getLocation()
{
    return location; 
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
       issuingEntityID.marshal(dos);
       collidingEntityID.marshal(dos);
       eventID.marshal(dos);
       collisionType.marshal(dos);
       dos.writeByte(pad);
       velocity.marshal(dos);
       dos.writeFloat(mass);
       location.marshal(dos);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += issuingEntityID.unmarshal(dis);
        uPosition += collidingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        collisionType = CollisionType.unmarshalEnum(dis);
        uPosition += collisionType.getMarshalledSize();
        pad = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += velocity.unmarshal(dis);
        mass = dis.readFloat();
        uPosition += 4;
        uPosition += location.unmarshal(dis);
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
   issuingEntityID.marshal(byteBuffer);
   collidingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   collisionType.marshal(byteBuffer);
   byteBuffer.put( (byte)pad);
   velocity.marshal(byteBuffer);
   byteBuffer.putFloat( (float)mass);
   location.marshal(byteBuffer);
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
    super.unmarshal(byteBuffer);

    issuingEntityID.unmarshal(byteBuffer);
    collidingEntityID.unmarshal(byteBuffer);
    eventID.unmarshal(byteBuffer);
    collisionType = CollisionType.unmarshalEnum(byteBuffer);
    pad = (byte)(byteBuffer.get() & 0xFF);
    velocity.unmarshal(byteBuffer);
    mass = byteBuffer.getFloat();
    location.unmarshal(byteBuffer);
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

     final CollisionPdu rhs = (CollisionPdu)obj;

     if( ! (issuingEntityID.equals( rhs.issuingEntityID) )) ivarsEqual = false;
     if( ! (collidingEntityID.equals( rhs.collidingEntityID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (collisionType == rhs.collisionType)) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (mass == rhs.mass)) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" issuingEntityID: ").append(issuingEntityID).append("\n");
    sb.append(" collidingEntityID: ").append(collidingEntityID).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" collisionType: ").append(collisionType).append("\n");
    sb.append(" pad: ").append(pad).append("\n");
    sb.append(" velocity: ").append(velocity).append("\n");
    sb.append(" mass: ").append(mass).append("\n");
    sb.append(" location: ").append(location).append("\n");

   return sb.toString();
 }
} // end of class
