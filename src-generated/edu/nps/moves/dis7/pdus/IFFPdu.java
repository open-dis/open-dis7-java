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
public class IFFPdu extends DistributedEmissionsFamilyPdu implements Serializable
{
   /** ID of the entity that is the source of the emissions */
   protected EntityID  emittingEntityId = new EntityID(); 

   /** Number generated by the issuing simulation to associate realted events. */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** Location wrt entity. There is some ambiguity in the standard here, but this is the order it is listed in the table. */
   protected Vector3Float  location = new Vector3Float(); 

   /** System ID information */
   protected SystemIdentifier  systemID = new SystemIdentifier(); 

   protected byte  systemDesignator;

   protected byte  systemSpecificData;

   /** fundamental parameters */
   protected FundamentalOperationalData  fundamentalParameters = new FundamentalOperationalData(); 


/** Constructor */
 public IFFPdu()
 {
    setPduType( DISPDUType.IDENTIFICATION_FRIEND_OR_FOE );
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
   marshalSize += emittingEntityId.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += location.getMarshalledSize();
   marshalSize += systemID.getMarshalledSize();
   marshalSize += 1;  // systemDesignator
   marshalSize += 1;  // systemSpecificData
   marshalSize += fundamentalParameters.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link IFFPdu#emittingEntityId}
  * @param pEmittingEntityId new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setEmittingEntityId(EntityID pEmittingEntityId)
{
    emittingEntityId = pEmittingEntityId;
    return this;
}

/** Getter for {@link IFFPdu#emittingEntityId}
  * @return value of interest */
public EntityID getEmittingEntityId()
{
    return emittingEntityId; 
}

/** Setter for {@link IFFPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link IFFPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link IFFPdu#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setLocation(Vector3Float pLocation)
{
    location = pLocation;
    return this;
}

/** Getter for {@link IFFPdu#location}
  * @return value of interest */
public Vector3Float getLocation()
{
    return location; 
}

/** Setter for {@link IFFPdu#systemID}
  * @param pSystemID new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemID(SystemIdentifier pSystemID)
{
    systemID = pSystemID;
    return this;
}

/** Getter for {@link IFFPdu#systemID}
  * @return value of interest */
public SystemIdentifier getSystemID()
{
    return systemID; 
}

/** Setter for {@link IFFPdu#systemDesignator}
  * @param pSystemDesignator new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemDesignator(byte pSystemDesignator)
{
    systemDesignator = pSystemDesignator;
    return this;
}
/** Utility setter for {@link IFFPdu#systemDesignator}
  * @param pSystemDesignator new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemDesignator(int pSystemDesignator){
    systemDesignator = (byte) pSystemDesignator;
    return this;
}

/** Getter for {@link IFFPdu#systemDesignator}
  * @return value of interest */
public byte getSystemDesignator()
{
    return systemDesignator; 
}

/** Setter for {@link IFFPdu#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemSpecificData(byte pSystemSpecificData)
{
    systemSpecificData = pSystemSpecificData;
    return this;
}
/** Utility setter for {@link IFFPdu#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemSpecificData(int pSystemSpecificData){
    systemSpecificData = (byte) pSystemSpecificData;
    return this;
}

/** Getter for {@link IFFPdu#systemSpecificData}
  * @return value of interest */
public byte getSystemSpecificData()
{
    return systemSpecificData; 
}

/** Setter for {@link IFFPdu#fundamentalParameters}
  * @param pFundamentalParameters new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setFundamentalParameters(FundamentalOperationalData pFundamentalParameters)
{
    fundamentalParameters = pFundamentalParameters;
    return this;
}

/** Getter for {@link IFFPdu#fundamentalParameters}
  * @return value of interest */
public FundamentalOperationalData getFundamentalParameters()
{
    return fundamentalParameters; 
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
       emittingEntityId.marshal(dos);
       eventID.marshal(dos);
       location.marshal(dos);
       systemID.marshal(dos);
       dos.writeByte(systemDesignator);
       dos.writeByte(systemSpecificData);
       fundamentalParameters.marshal(dos);
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
        uPosition += emittingEntityId.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        uPosition += systemID.unmarshal(dis);
        systemDesignator = (byte)dis.readUnsignedByte();
        uPosition += 1;
        systemSpecificData = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += fundamentalParameters.unmarshal(dis);
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
   emittingEntityId.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   location.marshal(byteBuffer);
   systemID.marshal(byteBuffer);
   byteBuffer.put( (byte)systemDesignator);
   byteBuffer.put( (byte)systemSpecificData);
   fundamentalParameters.marshal(byteBuffer);
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

    emittingEntityId.unmarshal(byteBuffer);
    eventID.unmarshal(byteBuffer);
    location.unmarshal(byteBuffer);
    systemID.unmarshal(byteBuffer);
    systemDesignator = (byte)(byteBuffer.get() & 0xFF);
    systemSpecificData = (byte)(byteBuffer.get() & 0xFF);
    fundamentalParameters.unmarshal(byteBuffer);
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

     final IFFPdu rhs = (IFFPdu)obj;

     if( ! (emittingEntityId.equals( rhs.emittingEntityId) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
     if( ! (systemID.equals( rhs.systemID) )) ivarsEqual = false;
     if( ! (systemDesignator == rhs.systemDesignator)) ivarsEqual = false;
     if( ! (systemSpecificData == rhs.systemSpecificData)) ivarsEqual = false;
     if( ! (fundamentalParameters.equals( rhs.fundamentalParameters) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" emittingEntityId: ").append(emittingEntityId).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" location: ").append(location).append("\n");
    sb.append(" systemID: ").append(systemID).append("\n");
    sb.append(" systemDesignator: ").append(systemDesignator).append("\n");
    sb.append(" systemSpecificData: ").append(systemSpecificData).append("\n");
    sb.append(" fundamentalParameters: ").append(fundamentalParameters).append("\n");

   return sb.toString();
 }
} // end of class
