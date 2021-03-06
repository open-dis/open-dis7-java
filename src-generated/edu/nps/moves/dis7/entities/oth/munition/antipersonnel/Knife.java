package edu.nps.moves.dis7.entities.oth.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c59a0f7;
 * Country: Other;
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 30304
 */
public class Knife extends EntityType
{
    /** Default constructor */
    public Knife()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 21697, Fixed
        setSubCategory((byte)4); // uid 30303, Blades
        setSpecific((byte)1); // uid 30304, Knife
    }
}
