package edu.nps.moves.dis7.entities.fin.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@c0c2f8d;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27629
 */
public class ArmoredUtilityVehicle extends EntityType
{
    /** Default constructor */
    public ArmoredUtilityVehicle()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27629, Armored Utility Vehicle
    }
}
