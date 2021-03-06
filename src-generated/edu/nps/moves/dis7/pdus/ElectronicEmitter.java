/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ElectronicEmitter extends Object implements Serializable
{
   /**  this field shall specify the length of this emitter system's data in 32-bit words. */
   protected byte  systemDataLength;

   /** the number of beams being described in the current PDU for the emitter system being described.  */
   protected byte  numberOfBeams;

   /**  information about a particular emitter system and shall be represented by an Emitter System record (see 6.2.23). */
   protected EmitterSystem  emitterSystem = new EmitterSystem(); 

   /** the location of the antenna beam source with respect to the emitting entity's coordinate system. This location shall be the origin of the emitter coordinate system that shall have the same orientation as the entity coordinate system. This field shall be represented by an Entity Coordinate Vector record see 6.2.95  */
   protected Vector3Float  location = new Vector3Float(); 

   /** Electronic emmission beams */
   protected List< EmitterBeam > beams = new ArrayList< EmitterBeam >();
 

/** Constructor */
 public ElectronicEmitter()
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

   marshalSize += 1;  // systemDataLength
   marshalSize += 1;  // numberOfBeams
   marshalSize += emitterSystem.getMarshalledSize();
   marshalSize += location.getMarshalledSize();
   for(int idx=0; idx < beams.size(); idx++)
   {
        EmitterBeam listElement = beams.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ElectronicEmitter#systemDataLength}
  * @param pSystemDataLength new value of interest
  * @return same object to permit progressive setters */
public ElectronicEmitter setSystemDataLength(byte pSystemDataLength)
{
    systemDataLength = pSystemDataLength;
    return this;
}
/** Utility setter for {@link ElectronicEmitter#systemDataLength}
  * @param pSystemDataLength new value of interest
  * @return same object to permit progressive setters */
public ElectronicEmitter setSystemDataLength(int pSystemDataLength){
    systemDataLength = (byte) pSystemDataLength;
    return this;
}

/** Getter for {@link ElectronicEmitter#systemDataLength}
  * @return value of interest */
public byte getSystemDataLength()
{
    return systemDataLength; 
}

/** Setter for {@link ElectronicEmitter#emitterSystem}
  * @param pEmitterSystem new value of interest
  * @return same object to permit progressive setters */
public ElectronicEmitter setEmitterSystem(EmitterSystem pEmitterSystem)
{
    emitterSystem = pEmitterSystem;
    return this;
}

/** Getter for {@link ElectronicEmitter#emitterSystem}
  * @return value of interest */
public EmitterSystem getEmitterSystem()
{
    return emitterSystem; 
}

/** Setter for {@link ElectronicEmitter#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public ElectronicEmitter setLocation(Vector3Float pLocation)
{
    location = pLocation;
    return this;
}

/** Getter for {@link ElectronicEmitter#location}
  * @return value of interest */
public Vector3Float getLocation()
{
    return location; 
}

/** Setter for {@link ElectronicEmitter#beams}
  * @param pBeams new value of interest
  * @return same object to permit progressive setters */
public ElectronicEmitter setBeams(List<EmitterBeam> pBeams)
{
    beams = pBeams;
    return this;
}

/** Getter for {@link ElectronicEmitter#beams}
  * @return value of interest */
public List<EmitterBeam> getBeams()
{
    return beams; 
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
       dos.writeByte(systemDataLength);
       dos.writeByte(beams.size());
       emitterSystem.marshal(dos);
       location.marshal(dos);

       for(int idx = 0; idx < beams.size(); idx++)
       {
            EmitterBeam aEmitterBeam = beams.get(idx);
            aEmitterBeam.marshal(dos);
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
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        systemDataLength = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfBeams = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += emitterSystem.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        for(int idx = 0; idx < numberOfBeams; idx++)
        {
            EmitterBeam anX = new EmitterBeam();
            uPosition += anX.unmarshal(dis);
            beams.add(anX);
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
   byteBuffer.put( (byte)systemDataLength);
   byteBuffer.put( (byte)beams.size());
   emitterSystem.marshal(byteBuffer);
   location.marshal(byteBuffer);

   for(int idx = 0; idx < beams.size(); idx++)
   {
        EmitterBeam aEmitterBeam = beams.get(idx);
        aEmitterBeam.marshal(byteBuffer);
   }

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
    systemDataLength = (byte)(byteBuffer.get() & 0xFF);
    numberOfBeams = (byte)(byteBuffer.get() & 0xFF);
    emitterSystem.unmarshal(byteBuffer);
    location.unmarshal(byteBuffer);
    for(int idx = 0; idx < numberOfBeams; idx++)
    {
    EmitterBeam anX = new EmitterBeam();
    anX.unmarshal(byteBuffer);
    beams.add(anX);
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

     final ElectronicEmitter rhs = (ElectronicEmitter)obj;

     if( ! (systemDataLength == rhs.systemDataLength)) ivarsEqual = false;
     if( ! (emitterSystem.equals( rhs.emitterSystem) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;

     for(int idx = 0; idx < beams.size(); idx++)
        if( ! ( beams.get(idx).equals(rhs.beams.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" systemDataLength: ").append(systemDataLength).append("\n");
    sb.append(" emitterSystem: ").append(emitterSystem).append("\n");
    sb.append(" location: ").append(location).append("\n");
    sb.append(" beams: ").append("\n");
    beams.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
