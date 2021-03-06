package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6e2aa843;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26338
 */
public class Unimog404S extends EntityType
{
    /** Default constructor */
    public Unimog404S()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle (greater than 1.25 tons)
        setSubCategory((byte)5); // uid 26335, MB Unimog Truck
        setSpecific((byte)2); // uid 26338, Unimog 404 S
    }
}
