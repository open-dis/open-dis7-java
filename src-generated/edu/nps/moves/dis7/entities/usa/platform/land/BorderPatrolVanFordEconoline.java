package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@46e3559f;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28320
 */
public class BorderPatrolVanFordEconoline extends EntityType
{
    /** Default constructor */
    public BorderPatrolVanFordEconoline()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24952, Single Unit Utility/Emergency Truck
        setSubCategory((byte)20); // uid 28318, Police Paddy Wagon
        setSpecific((byte)1); // uid 28319, Police Van, Ford Econoline
        setExtra((byte)1); // uid 28320, Border Patrol Van, Ford Econoline
    }
}
