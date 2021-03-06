package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c889805;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28327
 */
public class PoliceCarDodgeCharger extends EntityType
{
    /** Default constructor */
    public PoliceCarDodgeCharger()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24960, Utility/Emergency Car
        setSubCategory((byte)2); // uid 28324, Police Car
        setSpecific((byte)2); // uid 28327, Police Car, Dodge Charger
    }
}
