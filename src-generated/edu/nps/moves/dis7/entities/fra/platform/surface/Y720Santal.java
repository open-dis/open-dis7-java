package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7e057f43;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16110
 */
public class Y720Santal extends EntityType
{
    /** Default constructor */
    public Y720Santal()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16080, Auxiliary, Merchant Marine
        setSubCategory((byte)2); // uid 16087, Harbour tugs (Remorqueurs De Port)
        setSpecific((byte)1); // uid 16088, 105-ton type
        setExtra((byte)22); // uid 16110, Y 720 Santal
    }
}
