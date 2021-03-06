package edu.nps.moves.dis7.entities.ita.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7d50f2a8;
 * Country: Italy (ITA);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 21686
 */
public class WhiteheadA290 extends EntityType
{
    /** Default constructor */
    public WhiteheadA290()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 21684, Guided
        setSubCategory((byte)2); // uid 21686, Whitehead A290
    }
}
