package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23cbbd07;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23479
 */
public class RadioAccessUnitANTRC191 extends EntityType
{
    /** Default constructor */
    public RadioAccessUnitANTRC191()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)1); // uid 23472, Mobile Subscriber Equipment (MSE) Platform
        setSpecific((byte)7); // uid 23479, Radio Access Unit, AN/TRC-191
    }
}
