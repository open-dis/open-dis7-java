package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f8f9349;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18479
 */
public class A5333MOC1203 extends EntityType
{
    /** Default constructor */
    public A5333MOC1203()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)18); // uid 18476, Repair Craft (LCT 3 Type)
        setSpecific((byte)3); // uid 18479, A5333 MOC 1203
    }
}
