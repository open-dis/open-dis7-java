package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@576d5deb;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15924
 */
public class NuclearPropelledAircraftCarriersCVN extends EntityType
{
    /** Default constructor */
    public NuclearPropelledAircraftCarriersCVN()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 15923, Carrier (Porte-Avions)
        setSubCategory((byte)1); // uid 15924, Nuclear-Propelled Aircraft Carriers (CVN)
    }
}
