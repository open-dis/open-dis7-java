package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3d04a311;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31184
 */
public class GenericDirtBikeforAustralianArmy extends EntityType
{
    /** Default constructor */
    public GenericDirtBikeforAustralianArmy()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)80); // uid 31182, Motorcycle
        setSubCategory((byte)4); // uid 31183, Dirt Bike
        setSpecific((byte)1); // uid 31184, Generic Dirt Bike for Australian Army
    }
}
