package edu.nps.moves.dis7.entities.deu.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@67545b57;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16785
 */
public class S44ShishumarIndia extends EntityType
{
    /** Default constructor */
    public S44ShishumarIndia()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16757, SS (Conventional attack-torpedo patrol)
        setSubCategory((byte)4); // uid 16783, Type 209
        setSpecific((byte)1); // uid 16784, 1500
        setExtra((byte)1); // uid 16785, S44 Shishumar (India)
    }
}
