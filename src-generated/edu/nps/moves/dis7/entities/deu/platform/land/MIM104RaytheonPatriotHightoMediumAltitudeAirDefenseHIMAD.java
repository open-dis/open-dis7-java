package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@41488b16;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28096
 */
public class MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMAD extends EntityType
{
    /** Default constructor */
    public MIM104RaytheonPatriotHightoMediumAltitudeAirDefenseHIMAD()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 28096, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD)
    }
}
