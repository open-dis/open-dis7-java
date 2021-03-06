/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.3.3 Used to communicate the detonation or impact of munitions, as well as non-munition explosions, the burst or initial bloom of chaff, and the ignition of a flare.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class DetonationPdu extends WarfareFamilyPdu implements Serializable
{
   /** ID of the entity that shot */
   protected EntityID  sourceEntityID = new EntityID(); 

   /** ID of the entity that is being shot at */
   protected EntityID  targetEntityID = new EntityID(); 

   /** ID of the expendable entity, Section 7.3.3  */
   protected EntityID  explodingEntityID = new EntityID(); 

   /** ID of event, Section 7.3.3 */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** velocity of the munition immediately before detonation/impact, Section 7.3.3  */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** location of the munition detonation, the expendable detonation, Section 7.3.3  */
   protected Vector3Double  locationInWorldCoordinates = new Vector3Double(); 

   /** Describes the detonation represented, Section 7.3.3  */
   protected MunitionDescriptor  descriptor = new MunitionDescriptor(); 

   /** Velocity of the ammunition, Section 7.3.3  */
   protected Vector3Float  locationOfEntityCoordinates = new Vector3Float(); 

   /** result of the detonation, Section 7.3.3  uid 62 */
   protected DetonationResult detonationResult = DetonationResult.values()[0];

   /** How many articulation parameters we have, Section 7.3.3  */
   protected byte  numberOfVariableParameters;

   /** padding */
   protected short  pad;

   /** specify the parameter values for each Variable Parameter record, Section 7.3.3  */
   protected List< VariableParameter > variableParameters = new ArrayList< VariableParameter >();
 

/** Constructor */
 public DetonationPdu()
 {
    setPduType( DISPDUType.DETONATION );
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
   marshalSize += sourceEntityID.getMarshalledSize();
   marshalSize += targetEntityID.getMarshalledSize();
   marshalSize += explodingEntityID.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += velocity.getMarshalledSize();
   marshalSize += locationInWorldCoordinates.getMarshalledSize();
   marshalSize += descriptor.getMarshalledSize();
   marshalSize += locationOfEntityCoordinates.getMarshalledSize();
   marshalSize += detonationResult.getMarshalledSize();
   marshalSize += 1;  // numberOfVariableParameters
   marshalSize += 2;  // pad
   for(int idx=0; idx < variableParameters.size(); idx++)
   {
        VariableParameter listElement = variableParameters.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link DetonationPdu#sourceEntityID}
  * @param pSourceEntityID new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setSourceEntityID(EntityID pSourceEntityID)
{
    sourceEntityID = pSourceEntityID;
    return this;
}

/** Getter for {@link DetonationPdu#sourceEntityID}
  * @return value of interest */
public EntityID getSourceEntityID()
{
    return sourceEntityID; 
}

/** Setter for {@link DetonationPdu#targetEntityID}
  * @param pTargetEntityID new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setTargetEntityID(EntityID pTargetEntityID)
{
    targetEntityID = pTargetEntityID;
    return this;
}

/** Getter for {@link DetonationPdu#targetEntityID}
  * @return value of interest */
public EntityID getTargetEntityID()
{
    return targetEntityID; 
}

/** Setter for {@link DetonationPdu#explodingEntityID}
  * @param pExplodingEntityID new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setExplodingEntityID(EntityID pExplodingEntityID)
{
    explodingEntityID = pExplodingEntityID;
    return this;
}

/** Getter for {@link DetonationPdu#explodingEntityID}
  * @return value of interest */
public EntityID getExplodingEntityID()
{
    return explodingEntityID; 
}

/** Setter for {@link DetonationPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link DetonationPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link DetonationPdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}

/** Getter for {@link DetonationPdu#velocity}
  * @return value of interest */
public Vector3Float getVelocity()
{
    return velocity; 
}

/** Setter for {@link DetonationPdu#locationInWorldCoordinates}
  * @param pLocationInWorldCoordinates new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setLocationInWorldCoordinates(Vector3Double pLocationInWorldCoordinates)
{
    locationInWorldCoordinates = pLocationInWorldCoordinates;
    return this;
}

/** Getter for {@link DetonationPdu#locationInWorldCoordinates}
  * @return value of interest */
public Vector3Double getLocationInWorldCoordinates()
{
    return locationInWorldCoordinates; 
}

/** Setter for {@link DetonationPdu#descriptor}
  * @param pDescriptor new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setDescriptor(MunitionDescriptor pDescriptor)
{
    descriptor = pDescriptor;
    return this;
}

/** Getter for {@link DetonationPdu#descriptor}
  * @return value of interest */
public MunitionDescriptor getDescriptor()
{
    return descriptor; 
}

/** Setter for {@link DetonationPdu#locationOfEntityCoordinates}
  * @param pLocationOfEntityCoordinates new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setLocationOfEntityCoordinates(Vector3Float pLocationOfEntityCoordinates)
{
    locationOfEntityCoordinates = pLocationOfEntityCoordinates;
    return this;
}

/** Getter for {@link DetonationPdu#locationOfEntityCoordinates}
  * @return value of interest */
public Vector3Float getLocationOfEntityCoordinates()
{
    return locationOfEntityCoordinates; 
}

/** Setter for {@link DetonationPdu#detonationResult}
  * @param pDetonationResult new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setDetonationResult(DetonationResult pDetonationResult)
{
    detonationResult = pDetonationResult;
    return this;
}

/** Getter for {@link DetonationPdu#detonationResult}
  * @return value of interest */
public DetonationResult getDetonationResult()
{
    return detonationResult; 
}

/** Setter for {@link DetonationPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setPad(short pPad)
{
    pad = pPad;
    return this;
}
/** Utility setter for {@link DetonationPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setPad(int pPad){
    pad = (short) pPad;
    return this;
}

/** Getter for {@link DetonationPdu#pad}
  * @return value of interest */
public short getPad()
{
    return pad; 
}

/** Setter for {@link DetonationPdu#variableParameters}
  * @param pVariableParameters new value of interest
  * @return same object to permit progressive setters */
public DetonationPdu setVariableParameters(List<VariableParameter> pVariableParameters)
{
    variableParameters = pVariableParameters;
    return this;
}

/** Getter for {@link DetonationPdu#variableParameters}
  * @return value of interest */
public List<VariableParameter> getVariableParameters()
{
    return variableParameters; 
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
       sourceEntityID.marshal(dos);
       targetEntityID.marshal(dos);
       explodingEntityID.marshal(dos);
       eventID.marshal(dos);
       velocity.marshal(dos);
       locationInWorldCoordinates.marshal(dos);
       descriptor.marshal(dos);
       locationOfEntityCoordinates.marshal(dos);
       detonationResult.marshal(dos);
       dos.writeByte(variableParameters.size());
       dos.writeShort(pad);

       for(int idx = 0; idx < variableParameters.size(); idx++)
       {
            VariableParameter aVariableParameter = variableParameters.get(idx);
            aVariableParameter.marshal(dos);
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
        uPosition += sourceEntityID.unmarshal(dis);
        uPosition += targetEntityID.unmarshal(dis);
        uPosition += explodingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        uPosition += locationInWorldCoordinates.unmarshal(dis);
        uPosition += descriptor.unmarshal(dis);
        uPosition += locationOfEntityCoordinates.unmarshal(dis);
        detonationResult = DetonationResult.unmarshalEnum(dis);
        uPosition += detonationResult.getMarshalledSize();
        numberOfVariableParameters = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfVariableParameters; idx++)
        {
            VariableParameter anX = new VariableParameter();
            uPosition += anX.unmarshal(dis);
            variableParameters.add(anX);
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
   sourceEntityID.marshal(byteBuffer);
   targetEntityID.marshal(byteBuffer);
   explodingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   locationInWorldCoordinates.marshal(byteBuffer);
   descriptor.marshal(byteBuffer);
   locationOfEntityCoordinates.marshal(byteBuffer);
   detonationResult.marshal(byteBuffer);
   byteBuffer.put( (byte)variableParameters.size());
   byteBuffer.putShort( (short)pad);

   for(int idx = 0; idx < variableParameters.size(); idx++)
   {
        VariableParameter aVariableParameter = variableParameters.get(idx);
        aVariableParameter.marshal(byteBuffer);
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

    sourceEntityID.unmarshal(byteBuffer);
    targetEntityID.unmarshal(byteBuffer);
    explodingEntityID.unmarshal(byteBuffer);
    eventID.unmarshal(byteBuffer);
    velocity.unmarshal(byteBuffer);
    locationInWorldCoordinates.unmarshal(byteBuffer);
    descriptor.unmarshal(byteBuffer);
    locationOfEntityCoordinates.unmarshal(byteBuffer);
    detonationResult = DetonationResult.unmarshalEnum(byteBuffer);
    numberOfVariableParameters = (byte)(byteBuffer.get() & 0xFF);
    pad = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfVariableParameters; idx++)
    {
    VariableParameter anX = new VariableParameter();
    anX.unmarshal(byteBuffer);
    variableParameters.add(anX);
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

     final DetonationPdu rhs = (DetonationPdu)obj;

     if( ! (sourceEntityID.equals( rhs.sourceEntityID) )) ivarsEqual = false;
     if( ! (targetEntityID.equals( rhs.targetEntityID) )) ivarsEqual = false;
     if( ! (explodingEntityID.equals( rhs.explodingEntityID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (locationInWorldCoordinates.equals( rhs.locationInWorldCoordinates) )) ivarsEqual = false;
     if( ! (descriptor.equals( rhs.descriptor) )) ivarsEqual = false;
     if( ! (locationOfEntityCoordinates.equals( rhs.locationOfEntityCoordinates) )) ivarsEqual = false;
     if( ! (detonationResult == rhs.detonationResult)) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;

     for(int idx = 0; idx < variableParameters.size(); idx++)
        if( ! ( variableParameters.get(idx).equals(rhs.variableParameters.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" sourceEntityID: ").append(sourceEntityID).append("\n");
    sb.append(" targetEntityID: ").append(targetEntityID).append("\n");
    sb.append(" explodingEntityID: ").append(explodingEntityID).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" velocity: ").append(velocity).append("\n");
    sb.append(" locationInWorldCoordinates: ").append(locationInWorldCoordinates).append("\n");
    sb.append(" descriptor: ").append(descriptor).append("\n");
    sb.append(" locationOfEntityCoordinates: ").append(locationOfEntityCoordinates).append("\n");
    sb.append(" detonationResult: ").append(detonationResult).append("\n");
    sb.append(" pad: ").append(pad).append("\n");
    sb.append(" variableParameters: ").append("\n");
    variableParameters.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
