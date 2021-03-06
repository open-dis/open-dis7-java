/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.6.2 Communicate active electromagnetic emissions, including radar and radar-related electronic warfare (e.g., jamming). Exceptions include IFF interrogations and replies, navigation aids, voice, beacon and data radio communications, directed energy weapons, and laser ranging and designation systems, which are handled by other PDUs. Section 5.3.7.1.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ElectromagneticEmissionPdu extends DistributedEmissionsFamilyPdu implements Serializable
{
   /** ID of the entity emitting */
   protected EntityID  emittingEntityID = new EntityID(); 

   /** ID of event */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall be used to indicate if the data in the PDU represents a state update or just data that has changed since issuance of the last Electromagnetic Emission PDU [relative to the identified entity and emission system(s)]. uid 77 */
   protected ElectromagneticEmissionStateUpdateIndicator stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.values()[0];

   /** This field shall specify the number of emission systems being described in the current PDU. */
   protected byte  numberOfSystems;

   /** padding */
   protected short  paddingForEmissionsPdu;

   /** Electronic emmissions systems */
   protected List< ElectronicEmitter > systems = new ArrayList< ElectronicEmitter >();
 

/** Constructor */
 public ElectromagneticEmissionPdu()
 {
    setPduType( DISPDUType.ELECTROMAGNETIC_EMISSION );
    setPaddingForEmissionsPdu( (short)0 );
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
   marshalSize += emittingEntityID.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += stateUpdateIndicator.getMarshalledSize();
   marshalSize += 1;  // numberOfSystems
   marshalSize += 2;  // paddingForEmissionsPdu
   for(int idx=0; idx < systems.size(); idx++)
   {
        ElectronicEmitter listElement = systems.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ElectromagneticEmissionPdu#emittingEntityID}
  * @param pEmittingEntityID new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setEmittingEntityID(EntityID pEmittingEntityID)
{
    emittingEntityID = pEmittingEntityID;
    return this;
}

/** Getter for {@link ElectromagneticEmissionPdu#emittingEntityID}
  * @return value of interest */
public EntityID getEmittingEntityID()
{
    return emittingEntityID; 
}

/** Setter for {@link ElectromagneticEmissionPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link ElectromagneticEmissionPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link ElectromagneticEmissionPdu#stateUpdateIndicator}
  * @param pStateUpdateIndicator new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setStateUpdateIndicator(ElectromagneticEmissionStateUpdateIndicator pStateUpdateIndicator)
{
    stateUpdateIndicator = pStateUpdateIndicator;
    return this;
}

/** Getter for {@link ElectromagneticEmissionPdu#stateUpdateIndicator}
  * @return value of interest */
public ElectromagneticEmissionStateUpdateIndicator getStateUpdateIndicator()
{
    return stateUpdateIndicator; 
}

/** Setter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @param pPaddingForEmissionsPdu new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setPaddingForEmissionsPdu(short pPaddingForEmissionsPdu)
{
    paddingForEmissionsPdu = pPaddingForEmissionsPdu;
    return this;
}
/** Utility setter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @param pPaddingForEmissionsPdu new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setPaddingForEmissionsPdu(int pPaddingForEmissionsPdu){
    paddingForEmissionsPdu = (short) pPaddingForEmissionsPdu;
    return this;
}

/** Getter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @return value of interest */
public short getPaddingForEmissionsPdu()
{
    return paddingForEmissionsPdu; 
}

/** Setter for {@link ElectromagneticEmissionPdu#systems}
  * @param pSystems new value of interest
  * @return same object to permit progressive setters */
public ElectromagneticEmissionPdu setSystems(List<ElectronicEmitter> pSystems)
{
    systems = pSystems;
    return this;
}

/** Getter for {@link ElectromagneticEmissionPdu#systems}
  * @return value of interest */
public List<ElectronicEmitter> getSystems()
{
    return systems; 
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
       emittingEntityID.marshal(dos);
       eventID.marshal(dos);
       stateUpdateIndicator.marshal(dos);
       dos.writeByte(systems.size());
       dos.writeShort(paddingForEmissionsPdu);

       for(int idx = 0; idx < systems.size(); idx++)
       {
            ElectronicEmitter aElectronicEmitter = systems.get(idx);
            aElectronicEmitter.marshal(dos);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += emittingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.unmarshalEnum(dis);
        uPosition += stateUpdateIndicator.getMarshalledSize();
        numberOfSystems = (byte)dis.readUnsignedByte();
        uPosition += 1;
        paddingForEmissionsPdu = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfSystems; idx++)
        {
            ElectronicEmitter anX = new ElectronicEmitter();
            uPosition += anX.unmarshal(dis);
            systems.add(anX);
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
   super.marshal(byteBuffer);
   emittingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   stateUpdateIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)systems.size());
   byteBuffer.putShort( (short)paddingForEmissionsPdu);

   for(int idx = 0; idx < systems.size(); idx++)
   {
        ElectronicEmitter aElectronicEmitter = systems.get(idx);
        aElectronicEmitter.marshal(byteBuffer);
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
    super.unmarshal(byteBuffer);

    emittingEntityID.unmarshal(byteBuffer);
    eventID.unmarshal(byteBuffer);
    stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.unmarshalEnum(byteBuffer);
    numberOfSystems = (byte)(byteBuffer.get() & 0xFF);
    paddingForEmissionsPdu = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfSystems; idx++)
    {
    ElectronicEmitter anX = new ElectronicEmitter();
    anX.unmarshal(byteBuffer);
    systems.add(anX);
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final ElectromagneticEmissionPdu rhs = (ElectromagneticEmissionPdu)obj;

     if( ! (emittingEntityID.equals( rhs.emittingEntityID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (stateUpdateIndicator == rhs.stateUpdateIndicator)) ivarsEqual = false;
     if( ! (paddingForEmissionsPdu == rhs.paddingForEmissionsPdu)) ivarsEqual = false;

     for(int idx = 0; idx < systems.size(); idx++)
        if( ! ( systems.get(idx).equals(rhs.systems.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" emittingEntityID: ").append(emittingEntityID).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" stateUpdateIndicator: ").append(stateUpdateIndicator).append("\n");
    sb.append(" paddingForEmissionsPdu: ").append(paddingForEmissionsPdu).append("\n");
    sb.append(" systems: ").append("\n");
    systems.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
