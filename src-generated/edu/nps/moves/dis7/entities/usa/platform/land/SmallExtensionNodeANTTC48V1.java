package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@46e190ed;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23482
 */
public class SmallExtensionNodeANTTC48V1 extends EntityType
{
    /** Default constructor */
    public SmallExtensionNodeANTTC48V1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)1); // uid 23472, Mobile Subscriber Equipment (MSE) Platform
        setSpecific((byte)10); // uid 23482, Small Extension Node, AN/TTC-48(V)1
    }
}
