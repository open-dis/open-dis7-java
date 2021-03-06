package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78c03f1f;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29700
 */
public class BombardierBR180 extends EntityType
{
    /** Default constructor */
    public BombardierBR180()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 29698, Construction Specialty Vehicle
        setSubCategory((byte)39); // uid 29699, Snowcat
        setSpecific((byte)1); // uid 29700, Bombardier BR-180
    }
}
