package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5778826f;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24862
 */
public class KawasakiKLR250 extends EntityType
{
    /** Default constructor */
    public KawasakiKLR250()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)80); // uid 24860, Motorcycle
        setSubCategory((byte)2); // uid 24861, Sport/Street (Mid-Size)
        setSpecific((byte)1); // uid 24862, Kawasaki KLR 250
    }
}
